
package com.oracle.xmlns.irm.rights;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.irm.classifications.ItemCode;
import com.oracle.xmlns.irm.core.AccountRef;


/**
 * 
 *                         Context classified document rights. A right is the outcome of assigning a Document Role to an Account. A right can also specify item restrictions specific to the account. To hinder attempts at password sharing, document role based rights that are served to the device and cannot be used until the rights are checked back in from the device (or the offline period expires).
 *                     
 * 
 * <p>Java class for DocumentRight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentRight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="account" type="{http://xmlns.oracle.com/irm/core}AccountRef"/>
 *         &lt;element name="role" type="{http://xmlns.oracle.com/irm/rights}DocumentRole"/>
 *         &lt;element name="assignedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="itemCodes" type="{http://xmlns.oracle.com/irm/classifications}ItemCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="context" type="{http://xmlns.oracle.com/irm/rights}ContextInstanceRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentRight", propOrder = {
    "uuid",
    "account",
    "role",
    "assignedTime",
    "itemCodes",
    "context"
})
public class DocumentRight {

    @XmlElement(required = true)
    protected String uuid;
    @XmlElement(required = true)
    protected AccountRef account;
    @XmlElement(required = true)
    protected DocumentRole role;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assignedTime;
    protected List<ItemCode> itemCodes;
    @XmlElement(required = true)
    protected ContextInstanceRef context;

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

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
     *     {@link DocumentRole }
     *     
     */
    public DocumentRole getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentRole }
     *     
     */
    public void setRole(DocumentRole value) {
        this.role = value;
    }

    /**
     * Gets the value of the assignedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssignedTime() {
        return assignedTime;
    }

    /**
     * Sets the value of the assignedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssignedTime(XMLGregorianCalendar value) {
        this.assignedTime = value;
    }

    /**
     * Gets the value of the itemCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemCode }
     * 
     * 
     */
    public List<ItemCode> getItemCodes() {
        if (itemCodes == null) {
            itemCodes = new ArrayList<ItemCode>();
        }
        return this.itemCodes;
    }

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

}
