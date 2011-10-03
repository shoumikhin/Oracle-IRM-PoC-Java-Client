
package com.oracle.xmlns.irm.rights.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.irm.core.AccountRef;
import com.oracle.xmlns.irm.core.Label;
import com.oracle.xmlns.irm.rights.ContextInstanceVisibility;
import com.oracle.xmlns.irm.rights.ContextTemplateRef;


/**
 * 
 *                             Create a context. A context is created from a template. The template defines the structure of the context and what roles are available to assign to accounts. Only active templates can be provided when creating contexts. Changes to the template (post context creation) dynamically affect the context. e.g. adding a role to the template makes the role available to the context. When a context is created a Key Set is also generated and associated with the context.
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
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="template" type="{http://xmlns.oracle.com/irm/rights}ContextTemplateRef"/>
 *         &lt;element name="labels" type="{http://xmlns.oracle.com/irm/core}Label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="visibility" type="{http://xmlns.oracle.com/irm/rights}ContextInstance_Visibility"/>
 *         &lt;element name="managers" type="{http://xmlns.oracle.com/irm/core}AccountRef" maxOccurs="unbounded" minOccurs="0"/>
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
    "uuid",
    "template",
    "labels",
    "visibility",
    "managers"
})
@XmlRootElement(name = "CreateContextFromTemplate")
public class CreateContextFromTemplate {

    protected String uuid;
    @XmlElement(required = true)
    protected ContextTemplateRef template;
    protected List<Label> labels;
    @XmlElement(required = true)
    protected ContextInstanceVisibility visibility;
    protected List<AccountRef> managers;

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
     * Gets the value of the managers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountRef }
     * 
     * 
     */
    public List<AccountRef> getManagers() {
        if (managers == null) {
            managers = new ArrayList<AccountRef>();
        }
        return this.managers;
    }

}
