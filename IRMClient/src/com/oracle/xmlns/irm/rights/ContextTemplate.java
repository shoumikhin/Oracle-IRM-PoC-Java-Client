
package com.oracle.xmlns.irm.rights;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.irm.core.Label;


/**
 * 
 *                         Context template. A context template provides a template structure for creating a Context Instance. The template supplies the default labels for a context and the list of Document Role definitions available to the context manager. A Context Instance has a permanent link back to the context template. If changes are made to the roles in the template, they immediately take effect in the context. This allows new role definitions that are added to the template to immediately be available for use in the context.
 *                     
 * 
 * <p>Java class for ContextTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="labels" type="{http://xmlns.oracle.com/irm/core}Label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://xmlns.oracle.com/irm/rights}ContextTemplate_Status"/>
 *         &lt;element name="roles" type="{http://xmlns.oracle.com/irm/rights}DocumentRoleRef" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ContextTemplate", propOrder = {
    "uuid",
    "labels",
    "status",
    "roles",
    "domain"
})
public class ContextTemplate {

    @XmlElement(required = true)
    protected String uuid;
    protected List<Label> labels;
    @XmlElement(required = true)
    protected ContextTemplateStatus status;
    protected List<DocumentRoleRef> roles;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ContextTemplateStatus }
     *     
     */
    public ContextTemplateStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextTemplateStatus }
     *     
     */
    public void setStatus(ContextTemplateStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentRoleRef }
     * 
     * 
     */
    public List<DocumentRoleRef> getRoles() {
        if (roles == null) {
            roles = new ArrayList<DocumentRoleRef>();
        }
        return this.roles;
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
