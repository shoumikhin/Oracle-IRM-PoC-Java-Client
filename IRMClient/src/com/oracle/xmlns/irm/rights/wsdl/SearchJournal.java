
package com.oracle.xmlns.irm.rights.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.irm.classifications.ItemCode;
import com.oracle.xmlns.irm.core.PageRange;
import com.oracle.xmlns.irm.core.TimeRange;
import com.oracle.xmlns.irm.rights.ContextJournalSorting;


/**
 * 
 *                             Search the context journal. Search the context journal entries for activity on content for the specified accounts and/or document items. This search is restricted to the contexts available to the calling principal - i.e. the caller must be a context manager or inspector. If a large number of entries are identified a sub-set of entries in the requested time range will be provided.
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
 *         &lt;element name="accountNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="items" type="{http://xmlns.oracle.com/irm/classifications}ItemCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="timeRange" type="{http://xmlns.oracle.com/irm/core}TimeRange" minOccurs="0"/>
 *         &lt;element name="pageRange" type="{http://xmlns.oracle.com/irm/core}PageRange"/>
 *         &lt;element name="sorting" type="{http://xmlns.oracle.com/irm/rights}ContextJournalSorting" minOccurs="0"/>
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
    "accountNames",
    "items",
    "timeRange",
    "pageRange",
    "sorting"
})
@XmlRootElement(name = "SearchJournal")
public class SearchJournal {

    protected List<String> accountNames;
    protected List<ItemCode> items;
    protected TimeRange timeRange;
    @XmlElement(required = true)
    protected PageRange pageRange;
    protected ContextJournalSorting sorting;

    /**
     * Gets the value of the accountNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAccountNames() {
        if (accountNames == null) {
            accountNames = new ArrayList<String>();
        }
        return this.accountNames;
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

    /**
     * Gets the value of the timeRange property.
     * 
     * @return
     *     possible object is
     *     {@link TimeRange }
     *     
     */
    public TimeRange getTimeRange() {
        return timeRange;
    }

    /**
     * Sets the value of the timeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeRange }
     *     
     */
    public void setTimeRange(TimeRange value) {
        this.timeRange = value;
    }

    /**
     * Gets the value of the pageRange property.
     * 
     * @return
     *     possible object is
     *     {@link PageRange }
     *     
     */
    public PageRange getPageRange() {
        return pageRange;
    }

    /**
     * Sets the value of the pageRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageRange }
     *     
     */
    public void setPageRange(PageRange value) {
        this.pageRange = value;
    }

    /**
     * Gets the value of the sorting property.
     * 
     * @return
     *     possible object is
     *     {@link ContextJournalSorting }
     *     
     */
    public ContextJournalSorting getSorting() {
        return sorting;
    }

    /**
     * Sets the value of the sorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextJournalSorting }
     *     
     */
    public void setSorting(ContextJournalSorting value) {
        this.sorting = value;
    }

}
