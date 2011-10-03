
package com.oracle.xmlns.irm.rights;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Invalid time period. A document role must have a refresh period greater that one minute.
 *                     
 * 
 * <p>Java class for InvalidTimePeriodFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvalidTimePeriodFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentRole" type="{http://xmlns.oracle.com/irm/rights}DocumentRoleRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidTimePeriodFault", propOrder = {
    "documentRole"
})
public class InvalidTimePeriodFault {

    @XmlElement(required = true)
    protected DocumentRoleRef documentRole;

    /**
     * Gets the value of the documentRole property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentRoleRef }
     *     
     */
    public DocumentRoleRef getDocumentRole() {
        return documentRole;
    }

    /**
     * Sets the value of the documentRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentRoleRef }
     *     
     */
    public void setDocumentRole(DocumentRoleRef value) {
        this.documentRole = value;
    }

}
