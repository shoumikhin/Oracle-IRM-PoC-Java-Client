
package com.oracle.xmlns.irm.rights;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Immutable document role. If a role has been assigned to a user or group the role item constraints cannot be changed. Changing item constraints for an assigned role would change the semantics of the assigned role, changing item locks into item exclusions (or vice-versa).
 *                     
 * 
 * <p>Java class for ImmutableDocumentRoleFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImmutableDocumentRoleFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="role" type="{http://xmlns.oracle.com/irm/rights}DocumentRoleRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImmutableDocumentRoleFault", propOrder = {
    "role"
})
public class ImmutableDocumentRoleFault {

    @XmlElement(required = true)
    protected DocumentRoleRef role;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentRoleRef }
     *     
     */
    public DocumentRoleRef getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentRoleRef }
     *     
     */
    public void setRole(DocumentRoleRef value) {
        this.role = value;
    }

}
