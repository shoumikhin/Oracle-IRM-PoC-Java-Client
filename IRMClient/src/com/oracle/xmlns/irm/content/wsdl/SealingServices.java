
package com.oracle.xmlns.irm.content.wsdl;

import java.util.List;
import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.oracle.xmlns.irm.content.ContentDescription;
import com.oracle.xmlns.irm.content.CustomData;
import com.oracle.xmlns.irm.content.SealingOptions;
import com.oracle.xmlns.irm.core.Classification;


/**
 * 
 *             Sealing, unsealing, resealing and peeking services for content. Sealing is the process of taking unprotected content, encrypting it and adding in meta data called a classification. Unsealing is the term used when sealed content is decrypted. Resealing is the term used when altering the sealed content meta data or classification. Peeking is the term given to the process of extracting meta data from sealed content without decrypting the content. The methods on the sealing services are designed to used remotely, where the content is sent to a server, processes and the results returned to the client. The sealing services support the MTOM (Message Transmission Optimization Mechanism) feature. This allows the services to transfer the binary sealed and unsealed content in the most optimal form available. When sending content to using the sealing services it is recommended to enable MTOM in the client web service stack.
 *         
 * 
 * This class was generated by the JAX-WS RI.
 * Oracle JAX-WS 2.1.5
 * Generated source version: 2.1
 * 
 */
@WebService(name = "SealingServices", targetNamespace = "http://xmlns.oracle.com/irm/content/wsdl")
@XmlSeeAlso({
    com.oracle.xmlns.irm.content.ObjectFactory.class,
    com.oracle.xmlns.irm.content.wsdl.ObjectFactory.class,
    com.oracle.xmlns.irm.core.ObjectFactory.class,
    com.oracle.xmlns.irm.system.ObjectFactory.class
})
public interface SealingServices {


    /**
     * 
     *                 Seal content. Sealing is the process of taking plaintext content, encrypting and signing the content with an associated Classification. If the classification provided is a context classification system classification, this method will provide an automatic Item Code if one is not specified in the classification details. To perform a sealing operation the authenticated user must have the rights to seal content for the specified classification. Sealing is authorized if the authenticated user has a license that allows the oracle.irm.generic.Seal Feature for the Classification specified in the sealing options.
     *             
     * 
     * @param stream
     * @param mimeType
     * @param options
     * @return
     *     returns javax.activation.DataHandler
     * @throws AuthorizationDeniedFault
     * @throws IllegalEncryptedContentBlockSizeFault
     * @throws UnsupportedContentTypeFault
     * @throws PublicHeaderLengthFault
     */
    @WebMethod(operationName = "Seal", action = "urn:SealingServices#Seal")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Seal", targetNamespace = "http://xmlns.oracle.com/irm/content/wsdl", className = "com.oracle.xmlns.irm.content.wsdl.Seal")
    @ResponseWrapper(localName = "SealResponse", targetNamespace = "http://xmlns.oracle.com/irm/content/wsdl", className = "com.oracle.xmlns.irm.content.wsdl.SealResponse")
    public DataHandler seal(
        @WebParam(name = "stream", targetNamespace = "")
        DataHandler stream,
        @WebParam(name = "mimeType", targetNamespace = "")
        String mimeType,
        @WebParam(name = "options", targetNamespace = "")
        SealingOptions options)
        throws AuthorizationDeniedFault, IllegalEncryptedContentBlockSizeFault, PublicHeaderLengthFault, UnsupportedContentTypeFault
    ;

    /**
     * 
     *                 Unseal a stream into an output stream. Unsealing is the process of taking sealed content, de-crypting it and returning the original unsealed content. To perform an unsealing operation the authenticated user must have the rights to unseal content. Unsealing is allowed if the authenticated user has a license that allows the oracle.irm.generic.SaveUnsealed Feature for the content's Classification.
     *             
     * 
     * @param input
     * @return
     *     returns javax.activation.DataHandler
     * @throws AuthorizationDeniedFault
     * @throws ContentParseFault
     */
    @WebMethod(operationName = "Unseal", action = "urn:SealingServices#Unseal")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Unseal", targetNamespace = "http://xmlns.oracle.com/irm/content/wsdl", className = "com.oracle.xmlns.irm.content.wsdl.Unseal")
    @ResponseWrapper(localName = "UnsealResponse", targetNamespace = "http://xmlns.oracle.com/irm/content/wsdl", className = "com.oracle.xmlns.irm.content.wsdl.UnsealResponse")
    public DataHandler unseal(
        @WebParam(name = "input", targetNamespace = "")
        DataHandler input)
        throws AuthorizationDeniedFault, ContentParseFault
    ;

    /**
     * 
     *                 Reseal content with new custom data. Resealing is the process of altering the data or meta-data in sealed content. This method allows the custom data portion of the meta data to be replaced. To perform a resealing operation the authenticated user must have the rights to reseal the content. Resealing is allowed if the authenticated user has a valid license that has the oracle.irm.generic.Reseal Feature for the content's Classification.
     *             
     * 
     * @param input
     * @param customData
     * @return
     *     returns javax.activation.DataHandler
     * @throws AuthorizationDeniedFault
     * @throws ContentParseFault
     */
    @WebMethod(operationName = "Reseal", action = "urn:SealingServices#Reseal")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Reseal", targetNamespace = "http://xmlns.oracle.com/irm/content/wsdl", className = "com.oracle.xmlns.irm.content.wsdl.Reseal")
    @ResponseWrapper(localName = "ResealResponse", targetNamespace = "http://xmlns.oracle.com/irm/content/wsdl", className = "com.oracle.xmlns.irm.content.wsdl.ResealResponse")
    public DataHandler reseal(
        @WebParam(name = "input", targetNamespace = "")
        DataHandler input,
        @WebParam(name = "customData", targetNamespace = "")
        List<CustomData> customData)
        throws AuthorizationDeniedFault, ContentParseFault
    ;

    /**
     * 
     *                 Re-classify sealed content. Re-classification is the process of altering the Classification of the sealed content without having to perform a two step unseal and seal. During re-classification the content is re-encrypted and re-signed. If the classification labels or key set are not provided then the sealing process will attempt to fill in these details. If no labels are provided in the classification the labels are filled in automatically. Labels can only be filled in if provided classification Id matches the classification returned by the server. If no key set is provided then the key set is filled in from the license used to perform the sealing operation. If the license specifies multiple key sets then the first key set in the license is used. To perform a resealing operation the authenticated user must have a license for both the source classification and the target classification. The source classification license must allow the oracle.irm.generic.CopyTo or oracle.irm.generic.SaveUnsealed Feature. The target classification license must allow the oracle.irm.generic.Seal feature. If the source license has a copy to feature the transformation is only permitted if target classification is allowed by the trusted Destinations of the source classification license. If the source license has a save unsealed feature then there are no restrictions on the target classification.
     *             
     * 
     * @param input
     * @param classification
     * @return
     *     returns javax.activation.DataHandler
     * @throws AuthorizationDeniedFault
     * @throws ContentParseFault
     */
    @WebMethod(operationName = "Reclassify", action = "urn:SealingServices#Reclassify")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Reclassify", targetNamespace = "http://xmlns.oracle.com/irm/content/wsdl", className = "com.oracle.xmlns.irm.content.wsdl.Reclassify")
    @ResponseWrapper(localName = "ReclassifyResponse", targetNamespace = "http://xmlns.oracle.com/irm/content/wsdl", className = "com.oracle.xmlns.irm.content.wsdl.ReclassifyResponse")
    public DataHandler reclassify(
        @WebParam(name = "input", targetNamespace = "")
        DataHandler input,
        @WebParam(name = "classification", targetNamespace = "")
        Classification classification)
        throws AuthorizationDeniedFault, ContentParseFault
    ;

    /**
     * 
     *                 Peek sealed content. Peeking is the process of extracting the meta-data added to sealed content. This variant does not attempt to check the public header against its declared signature. If the meta-data has been altered post-sealing this method will not throw an exception. Any sealed content can be peek, the authenticated account does not require a license for the content's classification. This meta-data includes the Classification as well as information such as the Creation Time. The peeking process only examines the start of the sealed content. If a file is large it is not necessary to send the complete content, just the start of the file that contains the public header XML. This can improve performance when peeking large files.
     *             
     * 
     * @param input
     * @return
     *     returns com.oracle.xmlns.irm.content.ContentDescription
     * @throws ContentParseFault
     */
    @WebMethod(operationName = "Peek", action = "urn:SealingServices#Peek")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Peek", targetNamespace = "http://xmlns.oracle.com/irm/content/wsdl", className = "com.oracle.xmlns.irm.content.wsdl.Peek")
    @ResponseWrapper(localName = "PeekResponse", targetNamespace = "http://xmlns.oracle.com/irm/content/wsdl", className = "com.oracle.xmlns.irm.content.wsdl.PeekResponse")
    public ContentDescription peek(
        @WebParam(name = "input", targetNamespace = "")
        DataHandler input)
        throws ContentParseFault
    ;

    /**
     * 
     *                 Peek sealed content (with validation of the signature). Peeking is the process of extracting the meta-data added to sealed content. This variant attempts to check the public header against its declared signature. If the public header meta-data has been altered post sealing this method will throw an exception. A validated peek is allowed if the authenticated user has a license that has the open Feature for the content's Classification. The peeking process only examines the start of the sealed content. If a file is large it is not necessary to send the complete content, just the start of the file that contains the public header XML and signature. This can improve performance when peeking large files.
     *             
     * 
     * @param input
     * @return
     *     returns com.oracle.xmlns.irm.content.ContentDescription
     * @throws AuthorizationDeniedFault
     * @throws ContentParseFault
     */
    @WebMethod(operationName = "ValidatedPeek", action = "urn:SealingServices#ValidatedPeek")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ValidatedPeek", targetNamespace = "http://xmlns.oracle.com/irm/content/wsdl", className = "com.oracle.xmlns.irm.content.wsdl.ValidatedPeek")
    @ResponseWrapper(localName = "ValidatedPeekResponse", targetNamespace = "http://xmlns.oracle.com/irm/content/wsdl", className = "com.oracle.xmlns.irm.content.wsdl.ValidatedPeekResponse")
    public ContentDescription validatedPeek(
        @WebParam(name = "input", targetNamespace = "")
        DataHandler input)
        throws AuthorizationDeniedFault, ContentParseFault
    ;

}
