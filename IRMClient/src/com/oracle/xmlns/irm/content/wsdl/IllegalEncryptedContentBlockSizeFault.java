
package com.oracle.xmlns.irm.content.wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * Oracle JAX-WS 2.1.5
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "IllegalEncryptedContentBlockSizeFault", targetNamespace = "http://xmlns.oracle.com/irm/content/wsdl")
public class IllegalEncryptedContentBlockSizeFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.oracle.xmlns.irm.content.IllegalEncryptedContentBlockSizeFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public IllegalEncryptedContentBlockSizeFault(String message, com.oracle.xmlns.irm.content.IllegalEncryptedContentBlockSizeFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public IllegalEncryptedContentBlockSizeFault(String message, com.oracle.xmlns.irm.content.IllegalEncryptedContentBlockSizeFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.oracle.xmlns.irm.content.IllegalEncryptedContentBlockSizeFault
     */
    public com.oracle.xmlns.irm.content.IllegalEncryptedContentBlockSizeFault getFaultInfo() {
        return faultInfo;
    }

}