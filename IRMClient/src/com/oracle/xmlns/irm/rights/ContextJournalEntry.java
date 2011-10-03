
package com.oracle.xmlns.irm.rights;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.irm.classifications.ItemCode;
import com.oracle.xmlns.irm.core.Account;
import com.oracle.xmlns.irm.core.Device;
import com.oracle.xmlns.irm.core.Feature;


/**
 * 
 *                         Context journal entry. A context journal entry contains a record of an action performed on sealed content of the context classification system. The context journal entry contains the Time the action that was performed, whether the action was successful or unsuccessful, which Account performed the action, what Feature was performed on the content, the Context Instance of the content, the Item Code of the content, the URI source of the content and the Device the action was performed.
 *                     
 * 
 * <p>Java class for ContextJournalEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextJournalEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="status" type="{http://xmlns.oracle.com/irm/rights}ContextJournalEntry_Status"/>
 *         &lt;element name="account" type="{http://xmlns.oracle.com/irm/core}Account"/>
 *         &lt;element name="feature" type="{http://xmlns.oracle.com/irm/core}Feature"/>
 *         &lt;element name="contextInstance" type="{http://xmlns.oracle.com/irm/rights}ContextInstanceRef"/>
 *         &lt;element name="itemCode" type="{http://xmlns.oracle.com/irm/classifications}ItemCode"/>
 *         &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="device" type="{http://xmlns.oracle.com/irm/core}Device"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextJournalEntry", propOrder = {
    "uuid",
    "time",
    "status",
    "account",
    "feature",
    "contextInstance",
    "itemCode",
    "uri",
    "device"
})
public class ContextJournalEntry {

    @XmlElement(required = true)
    protected String uuid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    @XmlElement(required = true)
    protected ContextJournalEntryStatus status;
    @XmlElement(required = true)
    protected Account account;
    @XmlElement(required = true)
    protected Feature feature;
    @XmlElement(required = true)
    protected ContextInstanceRef contextInstance;
    @XmlElement(required = true)
    protected ItemCode itemCode;
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlElement(required = true)
    protected Device device;

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
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ContextJournalEntryStatus }
     *     
     */
    public ContextJournalEntryStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextJournalEntryStatus }
     *     
     */
    public void setStatus(ContextJournalEntryStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccount(Account value) {
        this.account = value;
    }

    /**
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link Feature }
     *     
     */
    public Feature getFeature() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Feature }
     *     
     */
    public void setFeature(Feature value) {
        this.feature = value;
    }

    /**
     * Gets the value of the contextInstance property.
     * 
     * @return
     *     possible object is
     *     {@link ContextInstanceRef }
     *     
     */
    public ContextInstanceRef getContextInstance() {
        return contextInstance;
    }

    /**
     * Sets the value of the contextInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextInstanceRef }
     *     
     */
    public void setContextInstance(ContextInstanceRef value) {
        this.contextInstance = value;
    }

    /**
     * Gets the value of the itemCode property.
     * 
     * @return
     *     possible object is
     *     {@link ItemCode }
     *     
     */
    public ItemCode getItemCode() {
        return itemCode;
    }

    /**
     * Sets the value of the itemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemCode }
     *     
     */
    public void setItemCode(ItemCode value) {
        this.itemCode = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link Device }
     *     
     */
    public Device getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link Device }
     *     
     */
    public void setDevice(Device value) {
        this.device = value;
    }

}
