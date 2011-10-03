
package com.oracle.xmlns.irm.rights.wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * Oracle JAX-WS 2.1.5
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "AccountAlreadyManagerFault", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl")
public class AccountAlreadyManagerFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.oracle.xmlns.irm.rights.AccountAlreadyManagerFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public AccountAlreadyManagerFault(String message, com.oracle.xmlns.irm.rights.AccountAlreadyManagerFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public AccountAlreadyManagerFault(String message, com.oracle.xmlns.irm.rights.AccountAlreadyManagerFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.oracle.xmlns.irm.rights.AccountAlreadyManagerFault
     */
    public com.oracle.xmlns.irm.rights.AccountAlreadyManagerFault getFaultInfo() {
        return faultInfo;
    }

}
