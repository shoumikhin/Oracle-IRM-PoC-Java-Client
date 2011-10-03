
package com.oracle.xmlns.irm.content.wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * Oracle JAX-WS 2.1.5
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "UnsupportedContentTypeFault", targetNamespace = "http://xmlns.oracle.com/irm/content/wsdl")
public class UnsupportedContentTypeFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.oracle.xmlns.irm.content.UnsupportedContentTypeFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public UnsupportedContentTypeFault(String message, com.oracle.xmlns.irm.content.UnsupportedContentTypeFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public UnsupportedContentTypeFault(String message, com.oracle.xmlns.irm.content.UnsupportedContentTypeFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.oracle.xmlns.irm.content.UnsupportedContentTypeFault
     */
    public com.oracle.xmlns.irm.content.UnsupportedContentTypeFault getFaultInfo() {
        return faultInfo;
    }

}
