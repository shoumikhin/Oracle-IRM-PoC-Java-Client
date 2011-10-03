
package com.oracle.xmlns.irm.rights.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.irm.classifications.ItemCode;
import com.oracle.xmlns.irm.rights.DocumentRightRef;
import com.oracle.xmlns.irm.rights.DocumentRoleRef;


/**
 * 
 *                             Alter role assignments. Change the role assigned to an account. This also resets any item restrictions placed on the assigned right. As an account can only have one role assigned within a Context this method can be used to alter the role assignment without a two-step unassign right and assign role.
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
 *         &lt;element name="rights" type="{http://xmlns.oracle.com/irm/rights}DocumentRightRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="role" type="{http://xmlns.oracle.com/irm/rights}DocumentRoleRef"/>
 *         &lt;element name="items" type="{http://xmlns.oracle.com/irm/classifications}ItemCode" maxOccurs="unbounded" minOccurs="0"/>
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
    "rights",
    "role",
    "items"
})
@XmlRootElement(name = "ReassignRole")
public class ReassignRole {

    protected List<DocumentRightRef> rights;
    @XmlElement(required = true)
    protected DocumentRoleRef role;
    protected List<ItemCode> items;

    /**
     * Gets the value of the rights property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rights property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRights().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentRightRef }
     * 
     * 
     */
    public List<DocumentRightRef> getRights() {
        if (rights == null) {
            rights = new ArrayList<DocumentRightRef>();
        }
        return this.rights;
    }

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

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemCode }
     * 
     * 
     */
    public List<ItemCode> getItems() {
        if (items == null) {
            items = new ArrayList<ItemCode>();
        }
        return this.items;
    }

}
