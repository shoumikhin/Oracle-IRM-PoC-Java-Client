
package com.oracle.xmlns.irm.rights.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.irm.core.PageRange;


/**
 * 
 *                             List contexts that the authenticated principal is authorized to access. A context can be accessed by any of it's context managers. Any inspector for the related domain (a context is related to a domain via it's context template) will be able to access the context as long as the context is visible to inspectors. Contexts are visible to inspectors by setting the Visibility property to the Domain.
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
 *         &lt;element name="pageRange" type="{http://xmlns.oracle.com/irm/core}PageRange"/>
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
    "pageRange"
})
@XmlRootElement(name = "ListContexts")
public class ListContexts {

    @XmlElement(required = true)
    protected PageRange pageRange;

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

}
