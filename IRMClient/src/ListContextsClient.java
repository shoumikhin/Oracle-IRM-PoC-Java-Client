package com.oracle.xmlns.irm.rights.wsdl;

import com.oracle.xmlns.irm.classifications.ItemCode;
import com.oracle.xmlns.irm.content.ContentDescription;
import com.oracle.xmlns.irm.content.wsdl.SealingServices;
import com.oracle.xmlns.irm.content.wsdl.SealingServicesService;
import com.oracle.xmlns.irm.core.AccountRef;

import com.oracle.xmlns.irm.core.Classification;
import com.oracle.xmlns.irm.core.Feature;
import com.oracle.xmlns.irm.core.Label;
import com.oracle.xmlns.irm.core.PageRange;
import com.oracle.xmlns.irm.rights.ContextInstance;

import com.oracle.xmlns.irm.rights.ContextInstanceRef;

import com.oracle.xmlns.irm.rights.DocumentRight;

import com.oracle.xmlns.irm.rights.DocumentRole;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URLEncoder;

import java.util.List;

import javax.activation.FileDataSource;

import javax.xml.rpc.ServiceException;

import utils.system;

public class ListContextsClient
{
    public static void main(String[] args) throws Exception
    {
        final String hostPort = args[0];
        final String username = args[1];
        final String password = args[2];
         
        // Configure an authenticator to provide the credentials for the web service
        Authenticator.setDefault(
        new Authenticator()
        {
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(username, password.toCharArray());
            }
        });
        
        try
        {                     
            javax.activation.DataHandler input = new javax.activation.DataHandler(new FileDataSource("hello.sdocx"));            
            SealingServices sealingServices = new SealingServicesService().getSealingServices(new javax.xml.ws.soap.MTOMFeature());
            
            ContentDescription results = sealingServices.peek(input);            
            Classification classification = results.getClassification();
            
            List<Label> labels = classification.getLabels();
             
            if (labels != null)
                for (Label label : labels)
                    System.out.println(label.getLocale().toString()+ " : " + label.getName());
            
            org.w3c.dom.Element element = (org.w3c.dom.Element)classification.getAny();
            org.w3c.dom.NodeList nodes = element.getElementsByTagName("context");
            org.w3c.dom.Node node = nodes.item(0);
            
            String contextUUID = node.getTextContent();
            ContextInstanceRef contextRef = new ContextInstanceRef();
            
            contextRef.setUuid(contextUUID);
            
            PageRange pageRange = new PageRange();
            
            pageRange.setFirst(1);
            pageRange.setLast(100);
                                     
            DocumentRightOperationsService documentRightOperationsService = new DocumentRightOperationsService();
            DocumentRightOperations documentRightOperations = documentRightOperationsService.getDocumentRightOperations();
               
            List<DocumentRight> rights = documentRightOperations.listRightsByContext(contextRef, pageRange);
            
            if (rights != null)
                for (DocumentRight right : rights)
                {
                    DocumentRole role = right.getRole();
                    
                    System.out.println("Role " + role.getUuid());
                    
                    List<Feature> features = role.getFeatures();
                    
                    for (Feature feature : features)
                        System.out.println("    " + feature.getId());
                }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
 }