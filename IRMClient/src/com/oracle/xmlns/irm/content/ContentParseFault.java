
package com.oracle.xmlns.irm.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Sealed content parse exception. This exception is thrown when the unsealing or resealing process encounters a parse error.
 *                     
 * 
 * <p>Java class for ContentParseFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentParseFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{http://xmlns.oracle.com/irm/content}ContentParseFault_Reason"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentParseFault", propOrder = {
    "reason"
})
public class ContentParseFault {

    @XmlElement(required = true)
    protected ContentParseFaultReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link ContentParseFaultReason }
     *     
     */
    public ContentParseFaultReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentParseFaultReason }
     *     
     */
    public void setReason(ContentParseFaultReason value) {
        this.reason = value;
    }

}
