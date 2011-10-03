
package com.oracle.xmlns.irm.rights;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.irm.core.AccountRef;


/**
 * 
 *                         Account already assigned a role. This exception is raised when an account already has a role assigned with a context.
 *                     
 * 
 * <p>Java class for AccountAlreadyAssignedFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountAlreadyAssignedFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{http://xmlns.oracle.com/irm/core}AccountRef"/>
 *         &lt;element name="role" type="{http://xmlns.oracle.com/irm/rights}DocumentRoleRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountAlreadyAssignedFault", propOrder = {
    "account",
    "role"
})
public class AccountAlreadyAssignedFault {

    @XmlElement(required = true)
    protected AccountRef account;
    @XmlElement(required = true)
    protected DocumentRoleRef role;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link AccountRef }
     *     
     */
    public AccountRef getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRef }
     *     
     */
    public void setAccount(AccountRef value) {
        this.account = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentRoleRef }
     *     
     */
    public DocumentRoleRef getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentRoleRef }
     *     
     */
    public void setRole(DocumentRoleRef value) {
        this.role = value;
    }

}
