
package com.oracle.xmlns.irm.rights.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.irm.rights.ContextInstance;


/**
 * 
 *                             Save changes to a context. Save changes to a Context Instance by providing two copies. Changes are made by comparing the two copies of the context. If there are no differences in a property then no changes are made to persistent storage for that property. Changes in collection based properties cause additions or removals to occur in persistent storage. For example, if the delta contains a new Label as compared to the context then a new label will be added.
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
 *         &lt;element name="context" type="{http://xmlns.oracle.com/irm/rights}ContextInstance"/>
 *         &lt;element name="delta" type="{http://xmlns.oracle.com/irm/rights}ContextInstance"/>
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
    "context",
    "delta"
})
@XmlRootElement(name = "SaveChangesToContext")
public class SaveChangesToContext {

    @XmlElement(required = true)
    protected ContextInstance context;
    @XmlElement(required = true)
    protected ContextInstance delta;

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link ContextInstance }
     *     
     */
    public ContextInstance getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextInstance }
     *     
     */
    public void setContext(ContextInstance value) {
        this.context = value;
    }

    /**
     * Gets the value of the delta property.
     * 
     * @return
     *     possible object is
     *     {@link ContextInstance }
     *     
     */
    public ContextInstance getDelta() {
        return delta;
    }

    /**
     * Sets the value of the delta property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextInstance }
     *     
     */
    public void setDelta(ContextInstance value) {
        this.delta = value;
    }

}
