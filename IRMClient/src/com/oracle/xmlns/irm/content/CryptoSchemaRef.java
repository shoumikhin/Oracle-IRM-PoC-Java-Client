
package com.oracle.xmlns.irm.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Sealed content cryptography schema. A cryptography schema is used to link a Key Set with the set of cryptography algorithms used when working with that key set. A cryptography schema must be specified when creating a key set. The schema defines what types of cryptography key are generated and what key sizes are used. The cryptography schema is also used (via the key set) when sealing or unsealing content. When performing operations such as sealing or unsealing the schema defines what algorithms are used for encrypting (and decrypting) the content, signing the content and calculating digests.
 *                     
 * 
 * <p>Java class for CryptoSchemaRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CryptoSchemaRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoSchemaRef", propOrder = {
    "id"
})
public class CryptoSchemaRef {

    @XmlElement(required = true)
    protected String id;

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

}
