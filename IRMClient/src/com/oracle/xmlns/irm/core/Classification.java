
package com.oracle.xmlns.irm.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.irm.content.KeySetRef;


/**
 * 
 *                         Classification. A classification is the set of meta-data sealed into content during the sealing process. This information includes the classification Cookie which is an opaque blob of data, the URI which is used to determine which server to contact for licenses and key sets, and the Classification Time which is used in license algorithms when determining whether content can be accessed. The format of the data in the cookie is defined by the classification System. For example, the context classification system provides a Context Cookie for the classification meta-data. A context cookie associates sealed content with a Context and an Item Code. License rules are then based on matching the context and/or item code.
 *                     
 * 
 * <p>Java class for Classification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Classification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="system" type="{http://xmlns.oracle.com/irm/core}ClassificationSystemRef"/>
 *         &lt;element name="keySet" type="{http://xmlns.oracle.com/irm/content}KeySetRef" minOccurs="0"/>
 *         &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;any/>
 *         &lt;element name="classificationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="labels" type="{http://xmlns.oracle.com/irm/core}Label" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Classification", propOrder = {
    "id",
    "system",
    "keySet",
    "uri",
    "any",
    "classificationTime",
    "labels"
})
public class Classification {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected ClassificationSystemRef system;
    protected KeySetRef keySet;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlAnyElement(lax = true)
    protected Object any;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar classificationTime;
    protected List<Label> labels;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSystemRef }
     *     
     */
    public ClassificationSystemRef getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSystemRef }
     *     
     */
    public void setSystem(ClassificationSystemRef value) {
        this.system = value;
    }

    /**
     * Gets the value of the keySet property.
     * 
     * @return
     *     possible object is
     *     {@link KeySetRef }
     *     
     */
    public KeySetRef getKeySet() {
        return keySet;
    }

    /**
     * Sets the value of the keySet property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeySetRef }
     *     
     */
    public void setKeySet(KeySetRef value) {
        this.keySet = value;
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
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

    /**
     * Gets the value of the classificationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClassificationTime() {
        return classificationTime;
    }

    /**
     * Sets the value of the classificationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClassificationTime(XMLGregorianCalendar value) {
        this.classificationTime = value;
    }

    /**
     * Gets the value of the labels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Label }
     * 
     * 
     */
    public List<Label> getLabels() {
        if (labels == null) {
            labels = new ArrayList<Label>();
        }
        return this.labels;
    }

}
