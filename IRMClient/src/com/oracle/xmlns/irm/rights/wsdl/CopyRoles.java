
package com.oracle.xmlns.irm.rights.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.irm.rights.DocumentRoleRef;
import com.oracle.xmlns.irm.rights.DomainRef;


/**
 * 
 *                             Copy a set of roles. Copy a set of document roles to another Domain. When roles are copied the rights assigned to those roles are not copied. Labels are also copied and altered to reflect that the result is a copy of the role. For example, in English, the role Contributor would turn into Copy Of Contributor.
 *                         
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roles" type="{http://xmlns.oracle.com/irm/rights}DocumentRoleRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="domain" type="{http://xmlns.oracle.com/irm/rights}DomainRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "roles",
    "domain"
})
@XmlRootElement(name = "CopyRoles")
public class CopyRoles {

    protected List<DocumentRoleRef> roles;
    @XmlElement(required = true)
    protected DomainRef domain;

    /**
     * Gets the value of the roles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentRoleRef }
     * 
     * 
     */
    public List<DocumentRoleRef> getRoles() {
        if (roles == null) {
            roles = new ArrayList<DocumentRoleRef>();
        }
        return this.roles;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link DomainRef }
     *     
     */
    public DomainRef getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainRef }
     *     
     */
    public void setDomain(DomainRef value) {
        this.domain = value;
    }

}
