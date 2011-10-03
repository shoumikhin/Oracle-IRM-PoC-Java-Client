
package com.oracle.xmlns.irm.rights;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.irm.classifications.ItemConstraintsType;
import com.oracle.xmlns.irm.core.Feature;
import com.oracle.xmlns.irm.core.Label;
import com.oracle.xmlns.irm.core.LicenseCriteriaStorage;
import com.oracle.xmlns.irm.core.TimePeriod;
import com.oracle.xmlns.irm.core.TimeSpan;


/**
 * 
 *                         Context classified document role. A document role defines what features of the IRM Desktop a user can perform. It includes details such as what features are audited, the elapsed time a document can be used off-line, item constraints and time constraints.
 *                     
 * 
 * <p>Java class for DocumentRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="labels" type="{http://xmlns.oracle.com/irm/core}Label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="storage" type="{http://xmlns.oracle.com/irm/core}LicenseCriteria_Storage"/>
 *         &lt;element name="features" type="{http://xmlns.oracle.com/irm/core}Feature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="timeSpans" type="{http://xmlns.oracle.com/irm/core}TimeSpan" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="refreshPeriod" type="{http://xmlns.oracle.com/irm/core}TimePeriod" minOccurs="0"/>
 *         &lt;element name="itemConstraints" type="{http://xmlns.oracle.com/irm/classifications}ItemConstraints_Type"/>
 *         &lt;element name="exportConstraints" type="{http://xmlns.oracle.com/irm/rights}DocumentRole_ExportConstraints"/>
 *         &lt;element name="domain" type="{http://xmlns.oracle.com/irm/rights}DomainRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentRole", propOrder = {
    "uuid",
    "labels",
    "storage",
    "features",
    "timeSpans",
    "refreshPeriod",
    "itemConstraints",
    "exportConstraints",
    "domain"
})
public class DocumentRole {

    @XmlElement(required = true)
    protected String uuid;
    protected List<Label> labels;
    @XmlElement(required = true)
    protected LicenseCriteriaStorage storage;
    protected List<Feature> features;
    protected List<TimeSpan> timeSpans;
    protected TimePeriod refreshPeriod;
    @XmlElement(required = true)
    protected ItemConstraintsType itemConstraints;
    @XmlElement(required = true)
    protected DocumentRoleExportConstraints exportConstraints;
    protected DomainRef domain;

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the labels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Label }
     * 
     * 
     */
    public List<Label> getLabels() {
        if (labels == null) {
            labels = new ArrayList<Label>();
        }
        return this.labels;
    }

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
     * Gets the value of the itemConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link ItemConstraintsType }
     *     
     */
    public ItemConstraintsType getItemConstraints() {
        return itemConstraints;
    }

    /**
     * Sets the value of the itemConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemConstraintsType }
     *     
     */
    public void setItemConstraints(ItemConstraintsType value) {
        this.itemConstraints = value;
    }

    /**
     * Gets the value of the exportConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentRoleExportConstraints }
     *     
     */
    public DocumentRoleExportConstraints getExportConstraints() {
        return exportConstraints;
    }

    /**
     * Sets the value of the exportConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentRoleExportConstraints }
     *     
     */
    public void setExportConstraints(DocumentRoleExportConstraints value) {
        this.exportConstraints = value;
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
