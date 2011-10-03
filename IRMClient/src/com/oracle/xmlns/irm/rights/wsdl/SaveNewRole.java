
package com.oracle.xmlns.irm.rights.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.irm.rights.DocumentRole;
import com.oracle.xmlns.irm.rights.DomainRef;


/**
 * 
 *                             Save a new document role. The document role will be owned by the specified Domain.
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
 *         &lt;element name="domain" type="{http://xmlns.oracle.com/irm/rights}DomainRef"/>
 *         &lt;element name="role" type="{http://xmlns.oracle.com/irm/rights}DocumentRole"/>
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
    "domain",
    "role"
})
@XmlRootElement(name = "SaveNewRole")
public class SaveNewRole {

    @XmlElement(required = true)
    protected DomainRef domain;
    @XmlElement(required = true)
    protected DocumentRole role;

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

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentRole }
     *     
     */
    public DocumentRole getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentRole }
     *     
     */
    public void setRole(DocumentRole value) {
        this.role = value;
    }

}
