
package com.oracle.xmlns.irm.rights.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.irm.rights.ContextInstanceRef;


/**
 * 
 *                             List document roles available to a context. The set of roles available to a context are based on the roles of associated template. Changes in the template's roles affect which roles are available to the context.
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
@XmlType(name = "", propOrder = {
    "context"
})
@XmlRootElement(name = "ListRolesForContext")
public class ListRolesForContext {

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
