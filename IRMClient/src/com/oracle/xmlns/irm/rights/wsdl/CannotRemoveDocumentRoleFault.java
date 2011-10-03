
package com.oracle.xmlns.irm.rights.wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * Oracle JAX-WS 2.1.5
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "CannotRemoveDocumentRoleFault", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl")
public class CannotRemoveDocumentRoleFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.oracle.xmlns.irm.rights.CannotRemoveDocumentRoleFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public CannotRemoveDocumentRoleFault(String message, com.oracle.xmlns.irm.rights.CannotRemoveDocumentRoleFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public CannotRemoveDocumentRoleFault(String message, com.oracle.xmlns.irm.rights.CannotRemoveDocumentRoleFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.oracle.xmlns.irm.rights.CannotRemoveDocumentRoleFault
     */
    public com.oracle.xmlns.irm.rights.CannotRemoveDocumentRoleFault getFaultInfo() {
        return faultInfo;
    }

}