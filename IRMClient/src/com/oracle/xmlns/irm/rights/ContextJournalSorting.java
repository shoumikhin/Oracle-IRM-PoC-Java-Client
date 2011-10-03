
package com.oracle.xmlns.irm.rights;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Sorting criteria for context based journal entries. Context journal searching operations allow the results to be sorted, based on properties of the Context Journal Entry. The context journal sort properties include the ability to sort on context Uuid and item code Value.
 *                     
 * 
 * <p>Java class for ContextJournalSorting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextJournalSorting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://xmlns.oracle.com/irm/rights}ContextJournalSorting_SortProperty"/>
 *         &lt;element name="order" type="{http://xmlns.oracle.com/irm/rights}ContextJournalSorting_SortOrder"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextJournalSorting", propOrder = {
    "value",
    "order"
})
public class ContextJournalSorting {

    @XmlElement(required = true)
    protected ContextJournalSortingSortProperty value;
    @XmlElement(required = true)
    protected ContextJournalSortingSortOrder order;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ContextJournalSortingSortProperty }
     *     
     */
    public ContextJournalSortingSortProperty getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextJournalSortingSortProperty }
     *     
     */
    public void setValue(ContextJournalSortingSortProperty value) {
        this.value = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link ContextJournalSortingSortOrder }
     *     
     */
    public ContextJournalSortingSortOrder getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextJournalSortingSortOrder }
     *     
     */
    public void setOrder(ContextJournalSortingSortOrder value) {
        this.order = value;
    }

}
