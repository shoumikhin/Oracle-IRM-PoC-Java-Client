
package com.oracle.xmlns.irm.rights;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         The context cannot be deleted. A context cannot be deleted if there are rights assigned with the context. This is restriction help prevents accidental context deletion.
 *                     
 * 
 * <p>Java class for CannotRemoveContextInstanceFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CannotRemoveContextInstanceFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="context" type="{http://xmlns.oracle.com/irm/rights}ContextInstanceRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CannotRemoveContextInstanceFault", propOrder = {
    "context"
})
public class CannotRemoveContextInstanceFault {

    @XmlElement(required = true)
    protected ContextInstanceRef context;

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link ContextInstanceRef }
     *     
     */
    public ContextInstanceRef getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextInstanceRef }
     *     
     */
    public void setContext(ContextInstanceRef value) {
        this.context = value;
    }

}
