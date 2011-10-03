
package com.oracle.xmlns.irm.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Unsupported cryptography schema. The cryptography schema is unsupported on the current deployment because one or more of the cryptography algorithms specified by that schema is unavailable. This exception may also indicate that a cryptography schema marked for use with FIPS approved implementations is being used in a non FIPS approved environment (or vice-versa).
 *                     
 * 
 * <p>Java class for UnsupportedCryptoSchemaFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnsupportedCryptoSchemaFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="schema" type="{http://xmlns.oracle.com/irm/content}CryptoSchema"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsupportedCryptoSchemaFault", propOrder = {
    "schema"
})
public class UnsupportedCryptoSchemaFault {

    @XmlElement(required = true)
    protected CryptoSchema schema;

    /**
     * Gets the value of the schema property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoSchema }
     *     
     */
    public CryptoSchema getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoSchema }
     *     
     */
    public void setSchema(CryptoSchema value) {
        this.schema = value;
    }

}
