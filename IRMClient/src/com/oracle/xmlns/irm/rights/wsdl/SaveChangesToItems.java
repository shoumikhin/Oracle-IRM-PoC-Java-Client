
package com.oracle.xmlns.irm.rights.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.irm.classifications.ItemCode;
import com.oracle.xmlns.irm.rights.DocumentRightRef;


/**
 * 
 *                             Alter the item restrictions for a set of rights. Alter the item restrictions on one or more Document Right. Changes are made to the list of item restrictions by comparing the two copies of the item codes provided and either removing or adding item restrictions by looking at the delta. For example if the delta (as compared to the first list of items) contains additional Item Code instances then new items will be added to the rights. However, if the delta (as compared to the first list of items) does not contain an Item Code instance then the items will be removed from the rights.
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
 *         &lt;element name="itemCodes" type="{http://xmlns.oracle.com/irm/classifications}ItemCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="delta" type="{http://xmlns.oracle.com/irm/classifications}ItemCode" maxOccurs="unbounded" minOccurs="0"/>
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
    "itemCodes",
    "delta"
})
@XmlRootElement(name = "SaveChangesToItems")
public class SaveChangesToItems {

    protected List<DocumentRightRef> rights;
    protected List<ItemCode> itemCodes;
    protected List<ItemCode> delta;

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
     * Gets the value of the delta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemCode }
     * 
     * 
     */
    public List<ItemCode> getDelta() {
        if (delta == null) {
            delta = new ArrayList<ItemCode>();
        }
        return this.delta;
    }

}
