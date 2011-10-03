
package com.oracle.xmlns.irm.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *                         A set of cryptography keys used in the sealing and unsealing process. A key set is the set of cryptography keys (and associated information) needed to create and open sealed content. Key sets are identified by a UUID. This UUID is stamped into sealed content and used to associate the content with the key set used to encrypt that content. The cryptography Schema determines what type and strength of cryptography keys are used. These cryptography keys, if required, can be provided with the key set in the Extensions property. This extensions property, for example, could contain the cryptography key values in wrapped form.
 *                     
 * 
 * <p>Java class for KeySet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeySet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="schema" type="{http://xmlns.oracle.com/irm/content}CryptoSchemaRef"/>
 *         &lt;element name="creationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="extensions" type="{http://xmlns.oracle.com/irm/content}KeySetExtensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeySet", propOrder = {
    "uuid",
    "schema",
    "creationTime",
    "extensions"
})
public class KeySet {

    @XmlElement(required = true)
    protected String uuid;
    @XmlElement(required = true)
    protected CryptoSchemaRef schema;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTime;
    protected KeySetExtensions extensions;

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
     * Gets the value of the schema property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoSchemaRef }
     *     
     */
    public CryptoSchemaRef getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoSchemaRef }
     *     
     */
    public void setSchema(CryptoSchemaRef value) {
        this.schema = value;
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
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link KeySetExtensions }
     *     
     */
    public KeySetExtensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeySetExtensions }
     *     
     */
    public void setExtensions(KeySetExtensions value) {
        this.extensions = value;
    }

}
