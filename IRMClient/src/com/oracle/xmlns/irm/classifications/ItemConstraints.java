
package com.oracle.xmlns.irm.classifications;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Item constraints. Item constraints contain a set of Item Code definitions that are either allowed or disallowed. A list of allowed items are called item locks and a list of excluded items are called item exclusions. Item constraints are used to create Classification Filter objects that allow (or disallow) access to individual sealed content items.
 *                     
 * 
 * <p>Java class for ItemConstraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemConstraints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemCodes" type="{http://xmlns.oracle.com/irm/classifications}ItemCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="type" type="{http://xmlns.oracle.com/irm/classifications}ItemConstraints_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemConstraints", propOrder = {
    "itemCodes",
    "type"
})
public class ItemConstraints {

    protected List<ItemCode> itemCodes;
    @XmlElement(required = true)
    protected ItemConstraintsType type;

    /**
     * Gets the value of the itemCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemCode }
     * 
     * 
     */
    public List<ItemCode> getItemCodes() {
        if (itemCodes == null) {
            itemCodes = new ArrayList<ItemCode>();
        }
        return this.itemCodes;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ItemConstraintsType }
     *     
     */
    public ItemConstraintsType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemConstraintsType }
     *     
     */
    public void setType(ItemConstraintsType value) {
        this.type = value;
    }

}
