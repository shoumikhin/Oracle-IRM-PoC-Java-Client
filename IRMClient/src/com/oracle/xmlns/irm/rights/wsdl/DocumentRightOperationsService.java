
package com.oracle.xmlns.irm.rights.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * 
 *             Document right operations. Document right operations include checking in rights, altering item restrictions, listing rights and checking items across sets of rights.
 *         
 * 
 * This class was generated by the JAX-WS RI.
 * Oracle JAX-WS 2.1.5
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "DocumentRightOperationsService", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", wsdlLocation = "http://ium-vbox-win2k8:16100/irm_services/document_right_operations?wsdl#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2Firm%2Frights%2Fwsdl%7DDocumentRightOperationsService")
public class DocumentRightOperationsService
    extends Service
{

    private final static URL DOCUMENTRIGHTOPERATIONSSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.oracle.xmlns.irm.rights.wsdl.DocumentRightOperationsService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.oracle.xmlns.irm.rights.wsdl.DocumentRightOperationsService.class.getResource(".");
            url = new URL(baseUrl, "http://ium-vbox-win2k8:16100/irm_services/document_right_operations?wsdl#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2Firm%2Frights%2Fwsdl%7DDocumentRightOperationsService");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://ium-vbox-win2k8:16100/irm_services/document_right_operations?wsdl#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2Firm%2Frights%2Fwsdl%7DDocumentRightOperationsService', retrying as a local file");
            logger.warning(e.getMessage());
        }
        DOCUMENTRIGHTOPERATIONSSERVICE_WSDL_LOCATION = url;
    }

    public DocumentRightOperationsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DocumentRightOperationsService() {
        super(DOCUMENTRIGHTOPERATIONSSERVICE_WSDL_LOCATION, new QName("http://xmlns.oracle.com/irm/rights/wsdl", "DocumentRightOperationsService"));
    }

    /**
     * 
     * @return
     *     returns DocumentRightOperations
     */
    @WebEndpoint(name = "DocumentRightOperations")
    public DocumentRightOperations getDocumentRightOperations() {
        return super.getPort(new QName("http://xmlns.oracle.com/irm/rights/wsdl", "DocumentRightOperations"), DocumentRightOperations.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DocumentRightOperations
     */
    @WebEndpoint(name = "DocumentRightOperations")
    public DocumentRightOperations getDocumentRightOperations(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/irm/rights/wsdl", "DocumentRightOperations"), DocumentRightOperations.class, features);
    }

}