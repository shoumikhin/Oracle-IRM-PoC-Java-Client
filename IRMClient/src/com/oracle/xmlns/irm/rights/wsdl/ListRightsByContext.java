
package com.oracle.xmlns.irm.rights.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.irm.core.PageRange;
import com.oracle.xmlns.irm.rights.ContextInstanceRef;


/**
 * 
 *                             List rights assigned within a context. This method lists rights assigned within a context, ordered by the date the role was assigned (most recent rights first). If large numbers of rights are assigned the page range parameter can be used to retrieve the rights in smaller chunks.
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
    "context",
    "pageRange"
})
@XmlRootElement(name = "ListRightsByContext")
public class ListRightsByContext {

    @XmlElement(required = true)
    protected ContextInstanceRef context;
    @XmlElement(required = true)
    protected PageRange pageRange;

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
