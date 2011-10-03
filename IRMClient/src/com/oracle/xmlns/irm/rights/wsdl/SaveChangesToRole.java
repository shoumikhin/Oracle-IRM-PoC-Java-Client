
package com.oracle.xmlns.irm.rights.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.irm.rights.DocumentRole;


/**
 * 
 *                             Save changes to a document role. Save changes to a Document Role by providing two copies. Changes are made by comparing the two copies of the role. If there are no differences in a property then no changes are made to persistent storage for that property. Changes in collection based properties cause additions or removals to occur in persistent storage. For example, if the delta contains a new Feature as compared to the role then a new role will be associated with the template.
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
 *         &lt;element name="role" type="{http://xmlns.oracle.com/irm/rights}DocumentRole"/>
 *         &lt;element name="delta" type="{http://xmlns.oracle.com/irm/rights}DocumentRole"/>
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
    "role",
    "delta"
})
@XmlRootElement(name = "SaveChangesToRole")
public class SaveChangesToRole {

    @XmlElement(required = true)
    protected DocumentRole role;
    @XmlElement(required = true)
    protected DocumentRole delta;

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

    /**
     * Gets the value of the delta property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentRole }
     *     
     */
    public DocumentRole getDelta() {
        return delta;
    }

    /**
     * Sets the value of the delta property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentRole }
     *     
     */
    public void setDelta(DocumentRole value) {
        this.delta = value;
    }

}
