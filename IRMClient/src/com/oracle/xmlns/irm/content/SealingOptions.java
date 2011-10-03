
package com.oracle.xmlns.irm.content;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.irm.core.Classification;


/**
 * 
 *                         Sealing options. There are a number of parameters required when content is sealed. These include the Classification details, additional user defined custom meta data, a content schema and fine-grained control of the content encryption processes (using encryption options).
 *                     
 * 
 * <p>Java class for SealingOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SealingOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classification" type="{http://xmlns.oracle.com/irm/core}Classification"/>
 *         &lt;element name="customData" type="{http://xmlns.oracle.com/irm/content}CustomData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contentSchema" type="{http://xmlns.oracle.com/irm/content}ContentSchema" minOccurs="0"/>
 *         &lt;element name="creationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="encryptionOptions" type="{http://xmlns.oracle.com/irm/content}EncryptionOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SealingOptions", propOrder = {
    "classification",
    "customData",
    "contentSchema",
    "creationTime",
    "encryptionOptions"
})
public class SealingOptions {

    @XmlElement(required = true)
    protected Classification classification;
    protected List<CustomData> customData;
    protected ContentSchema contentSchema;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTime;
    protected EncryptionOptions encryptionOptions;

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link Classification }
     *     
     */
    public Classification getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Classification }
     *     
     */
    public void setClassification(Classification value) {
        this.classification = value;
    }

    /**
     * Gets the value of the customData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomData }
     * 
     * 
     */
    public List<CustomData> getCustomData() {
        if (customData == null) {
            customData = new ArrayList<CustomData>();
        }
        return this.customData;
    }

    /**
     * Gets the value of the contentSchema property.
     * 
     * @return
     *     possible object is
     *     {@link ContentSchema }
     *     
     */
    public ContentSchema getContentSchema() {
        return contentSchema;
    }

    /**
     * Sets the value of the contentSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentSchema }
     *     
     */
    public void setContentSchema(ContentSchema value) {
        this.contentSchema = value;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the encryptionOptions property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionOptions }
     *     
     */
    public EncryptionOptions getEncryptionOptions() {
        return encryptionOptions;
    }

    /**
     * Sets the value of the encryptionOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionOptions }
     *     
     */
    public void setEncryptionOptions(EncryptionOptions value) {
        this.encryptionOptions = value;
    }

}
