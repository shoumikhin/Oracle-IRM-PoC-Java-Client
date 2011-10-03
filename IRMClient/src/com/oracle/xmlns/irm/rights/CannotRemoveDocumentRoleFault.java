
package com.oracle.xmlns.irm.rights;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         The document role cannot be deleted. A document role cannot be deleted is there are rights assigned to the role. The document role can only be deleted once all rights have been unassigned. This is restriction stops a role deletion affecting user's rights.
 *                     
 * 
 * <p>Java class for CannotRemoveDocumentRoleFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CannotRemoveDocumentRoleFault">
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
@XmlType(name = "CannotRemoveDocumentRoleFault", propOrder = {
    "documentRole"
})
public class CannotRemoveDocumentRoleFault {

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
