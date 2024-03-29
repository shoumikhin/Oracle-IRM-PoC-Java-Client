
package com.oracle.xmlns.irm.rights.wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * Oracle JAX-WS 2.1.5
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "UnknownDomainFault", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl")
public class UnknownDomainFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.oracle.xmlns.irm.rights.UnknownDomainFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public UnknownDomainFault(String message, com.oracle.xmlns.irm.rights.UnknownDomainFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public UnknownDomainFault(String message, com.oracle.xmlns.irm.rights.UnknownDomainFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.oracle.xmlns.irm.rights.UnknownDomainFault
     */
    public com.oracle.xmlns.irm.rights.UnknownDomainFault getFaultInfo() {
        return faultInfo;
    }

}
