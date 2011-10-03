
package com.oracle.xmlns.irm.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         A set of cryptography keys used in the sealing and unsealing process. A key set is the set of cryptography keys (and associated information) needed to create and open sealed content. Key sets are identified by a UUID. This UUID is stamped into sealed content and used to associate the content with the key set used to encrypt that content. The cryptography Schema determines what type and strength of cryptography keys are used. These cryptography keys, if required, can be provided with the key set in the Extensions property. This extensions property, for example, could contain the cryptography key values in wrapped form.
 *                     
 * 
 * <p>Java class for KeySetRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeySetRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeySetRef", propOrder = {
    "uuid"
})
public class KeySetRef {

    @XmlElement(required = true)
    protected String uuid;

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

}
