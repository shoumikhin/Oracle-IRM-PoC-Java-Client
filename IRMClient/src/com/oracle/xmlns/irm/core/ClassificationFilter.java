
package com.oracle.xmlns.irm.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Classification filtering. A classification filter is a way of identifying a set of classifications. The classification filter is used by License algorithms to relate license use to content. Content contains a Classification, a license contains the filter. A license can be used if it's classification filter matches the classification embedded in the sealed content.
 *                     
 * 
 * <p>Java class for ClassificationFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassificationFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="system" type="{http://xmlns.oracle.com/irm/core}ClassificationSystemRef"/>
 *         &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationFilter", propOrder = {
    "system",
    "uri",
    "index"
})
@XmlSeeAlso({
    XPathClassificationFilter.class
})
public abstract class ClassificationFilter {

    @XmlElement(required = true)
    protected ClassificationSystemRef system;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    protected String index;

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSystemRef }
     *     
     */
    public ClassificationSystemRef getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSystemRef }
     *     
     */
    public void setSystem(ClassificationSystemRef value) {
        this.system = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

}
