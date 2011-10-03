
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
 *                         Sealed content meta data. The sealed content description is meta data that is added to content during the sealing process. The content description contains the classification details and any user defined meta data. The content description can be extracted from sealed content using the Peek method.
 *                     
 * 
 * <p>Java class for ContentDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="schema" type="{http://xmlns.oracle.com/irm/content}ContentSchema"/>
 *         &lt;element name="classification" type="{http://xmlns.oracle.com/irm/core}Classification"/>
 *         &lt;element name="customData" type="{http://xmlns.oracle.com/irm/content}CustomData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="creationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="editTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sealedMime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unsealedSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentDescription", propOrder = {
    "schema",
    "classification",
    "customData",
    "creationTime",
    "editTime",
    "sealedMime",
    "unsealedSize"
})
public class ContentDescription {

    @XmlElement(required = true)
    protected ContentSchema schema;
    @XmlElement(required = true)
    protected Classification classification;
    protected List<CustomData> customData;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar editTime;
    @XmlElement(required = true)
    protected String sealedMime;
    protected long unsealedSize;

    /**
     * Gets the value of the schema property.
     * 
     * @return
     *     possible object is
     *     {@link ContentSchema }
     *     
     */
    public ContentSchema getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentSchema }
     *     
     */
    public void setSchema(ContentSchema value) {
        this.schema = value;
    }

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
     * Gets the value of the editTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEditTime() {
        return editTime;
    }

    /**
     * Sets the value of the editTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEditTime(XMLGregorianCalendar value) {
        this.editTime = value;
    }

    /**
     * Gets the value of the sealedMime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSealedMime() {
        return sealedMime;
    }

    /**
     * Sets the value of the sealedMime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSealedMime(String value) {
        this.sealedMime = value;
    }

    /**
     * Gets the value of the unsealedSize property.
     * 
     */
    public long getUnsealedSize() {
        return unsealedSize;
    }

    /**
     * Sets the value of the unsealedSize property.
     * 
     */
    public void setUnsealedSize(long value) {
        this.unsealedSize = value;
    }

}
