
package com.oracle.xmlns.irm.rights.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.irm.classifications.ItemCode;
import com.oracle.xmlns.irm.core.AccountRef;
import com.oracle.xmlns.irm.rights.ContextInstanceRef;
import com.oracle.xmlns.irm.rights.DocumentRoleRef;


/**
 * 
 *                             Assign a document role. A document role can be assigned, within a context, to one or more accounts. An account can only have one role assigned within a Context. If any of the provided accounts already has the role assigned the account is silently ignored and the role is not re-assigned.
 *                         
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="context" type="{http://xmlns.oracle.com/irm/rights}ContextInstanceRef"/>
 *         &lt;element name="role" type="{http://xmlns.oracle.com/irm/rights}DocumentRoleRef"/>
 *         &lt;element name="accounts" type="{http://xmlns.oracle.com/irm/core}AccountRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="items" type="{http://xmlns.oracle.com/irm/classifications}ItemCode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "context",
    "role",
    "accounts",
    "items"
})
@XmlRootElement(name = "AssignRole")
public class AssignRole {

    @XmlElement(required = true)
    protected ContextInstanceRef context;
    @XmlElement(required = true)
    protected DocumentRoleRef role;
    protected List<AccountRef> accounts;
    protected List<ItemCode> items;

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link ContextInstanceRef }
     *     
     */
    public ContextInstanceRef getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextInstanceRef }
     *     
     */
    public void setContext(ContextInstanceRef value) {
        this.context = value;
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

    /**
     * Gets the value of the accounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountRef }
     * 
     * 
     */
    public List<AccountRef> getAccounts() {
        if (accounts == null) {
            accounts = new ArrayList<AccountRef>();
        }
        return this.accounts;
    }

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemCode }
     * 
     * 
     */
    public List<ItemCode> getItems() {
        if (items == null) {
            items = new ArrayList<ItemCode>();
        }
        return this.items;
    }

}
