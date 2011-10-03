
package com.oracle.xmlns.irm.rights;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         The context template is inactive. An inactive context template cannot be used to create a context. The template must be made active before it can be used to create contexts.
 *                     
 * 
 * <p>Java class for InactiveContextTemplateFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InactiveContextTemplateFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextTemplate" type="{http://xmlns.oracle.com/irm/rights}ContextTemplateRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InactiveContextTemplateFault", propOrder = {
    "contextTemplate"
})
public class InactiveContextTemplateFault {

    @XmlElement(required = true)
    protected ContextTemplateRef contextTemplate;

    /**
     * Gets the value of the contextTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link ContextTemplateRef }
     *     
     */
    public ContextTemplateRef getContextTemplate() {
        return contextTemplate;
    }

    /**
     * Sets the value of the contextTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextTemplateRef }
     *     
     */
    public void setContextTemplate(ContextTemplateRef value) {
        this.contextTemplate = value;
    }

}
