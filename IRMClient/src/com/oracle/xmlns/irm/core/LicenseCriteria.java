
package com.oracle.xmlns.irm.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         License criteria. The license criteria defines the what you can do, with what classifications and when criteria.
 *                     
 * 
 * <p>Java class for LicenseCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicenseCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="storage" type="{http://xmlns.oracle.com/irm/core}LicenseCriteria_Storage"/>
 *         &lt;element name="delivery" type="{http://xmlns.oracle.com/irm/core}LicenseCriteria_Delivery"/>
 *         &lt;element name="use" type="{http://xmlns.oracle.com/irm/core}LicenseCriteria_Use"/>
 *         &lt;element name="features" type="{http://xmlns.oracle.com/irm/core}Feature" maxOccurs="unbounded"/>
 *         &lt;element name="timeSpans" type="{http://xmlns.oracle.com/irm/core}TimeSpan" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="refreshPeriod" type="{http://xmlns.oracle.com/irm/core}TimePeriod" minOccurs="0"/>
 *         &lt;element name="classifications" type="{http://xmlns.oracle.com/irm/core}ClassificationFilter"/>
 *         &lt;element name="destinations" type="{http://xmlns.oracle.com/irm/core}ClassificationFilter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseCriteria", propOrder = {
    "storage",
    "delivery",
    "use",
    "features",
    "timeSpans",
    "refreshPeriod",
    "classifications",
    "destinations"
})
public class LicenseCriteria {

    @XmlElement(required = true)
    protected LicenseCriteriaStorage storage;
    @XmlElement(required = true)
    protected LicenseCriteriaDelivery delivery;
    @XmlElement(required = true)
    protected LicenseCriteriaUse use;
    @XmlElement(required = true)
    protected List<Feature> features;
    protected List<TimeSpan> timeSpans;
    protected TimePeriod refreshPeriod;
    @XmlElement(required = true)
    protected ClassificationFilter classifications;
    protected ClassificationFilter destinations;

    /**
     * Gets the value of the storage property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseCriteriaStorage }
     *     
     */
    public LicenseCriteriaStorage getStorage() {
        return storage;
    }

    /**
     * Sets the value of the storage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseCriteriaStorage }
     *     
     */
    public void setStorage(LicenseCriteriaStorage value) {
        this.storage = value;
    }

    /**
     * Gets the value of the delivery property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseCriteriaDelivery }
     *     
     */
    public LicenseCriteriaDelivery getDelivery() {
        return delivery;
    }

    /**
     * Sets the value of the delivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseCriteriaDelivery }
     *     
     */
    public void setDelivery(LicenseCriteriaDelivery value) {
        this.delivery = value;
    }

    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseCriteriaUse }
     *     
     */
    public LicenseCriteriaUse getUse() {
        return use;
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseCriteriaUse }
     *     
     */
    public void setUse(LicenseCriteriaUse value) {
        this.use = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the features property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Feature }
     * 
     * 
     */
    public List<Feature> getFeatures() {
        if (features == null) {
            features = new ArrayList<Feature>();
        }
        return this.features;
    }

    /**
     * Gets the value of the timeSpans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeSpans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeSpans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeSpan }
     * 
     * 
     */
    public List<TimeSpan> getTimeSpans() {
        if (timeSpans == null) {
            timeSpans = new ArrayList<TimeSpan>();
        }
        return this.timeSpans;
    }

    /**
     * Gets the value of the refreshPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getRefreshPeriod() {
        return refreshPeriod;
    }

    /**
     * Sets the value of the refreshPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setRefreshPeriod(TimePeriod value) {
        this.refreshPeriod = value;
    }

    /**
     * Gets the value of the classifications property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationFilter }
     *     
     */
    public ClassificationFilter getClassifications() {
        return classifications;
    }

    /**
     * Sets the value of the classifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationFilter }
     *     
     */
    public void setClassifications(ClassificationFilter value) {
        this.classifications = value;
    }

    /**
     * Gets the value of the destinations property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationFilter }
     *     
     */
    public ClassificationFilter getDestinations() {
        return destinations;
    }

    /**
     * Sets the value of the destinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationFilter }
     *     
     */
    public void setDestinations(ClassificationFilter value) {
        this.destinations = value;
    }

}
