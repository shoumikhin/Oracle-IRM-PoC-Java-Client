
package com.oracle.xmlns.irm.rights;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.irm.classifications.Context;
import com.oracle.xmlns.irm.classifications.ItemCode;
import com.oracle.xmlns.irm.core.Label;


/**
 * 
 *                         A context created from a template. A Context created from Context Template has a number of additional properties relating to Domain administration and Item Code usage.
 *                     
 * 
 * <p>Java class for ContextInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextInstance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/irm/classifications}Context">
 *       &lt;sequence>
 *         &lt;element name="labels" type="{http://xmlns.oracle.com/irm/core}Label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="items" type="{http://xmlns.oracle.com/irm/classifications}ItemCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="trustedContexts" type="{http://xmlns.oracle.com/irm/rights}ContextInstanceRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="visibility" type="{http://xmlns.oracle.com/irm/rights}ContextInstance_Visibility"/>
 *         &lt;element name="template" type="{http://xmlns.oracle.com/irm/rights}ContextTemplateRef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextInstance", propOrder = {
    "labels",
    "items",
    "trustedContexts",
    "visibility",
    "template"
})
public class ContextInstance
    extends Context
{

    protected List<Label> labels;
    protected List<ItemCode> items;
    protected List<ContextInstanceRef> trustedContexts;
    @XmlElement(required = true)
    protected ContextInstanceVisibility visibility;
    @XmlElement(required = true)
    protected ContextTemplateRef template;

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
     * Gets the value of the trustedContexts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trustedContexts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrustedContexts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContextInstanceRef }
     * 
     * 
     */
    public List<ContextInstanceRef> getTrustedContexts() {
        if (trustedContexts == null) {
            trustedContexts = new ArrayList<ContextInstanceRef>();
        }
        return this.trustedContexts;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link ContextInstanceVisibility }
     *     
     */
    public ContextInstanceVisibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextInstanceVisibility }
     *     
     */
    public void setVisibility(ContextInstanceVisibility value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link ContextTemplateRef }
     *     
     */
    public ContextTemplateRef getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextTemplateRef }
     *     
     */
    public void setTemplate(ContextTemplateRef value) {
        this.template = value;
    }

}
