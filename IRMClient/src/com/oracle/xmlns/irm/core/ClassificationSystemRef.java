
package com.oracle.xmlns.irm.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Classification system. A classification system is a definition of what data is sealed into content, how that meta-data is used to grant access to that content and how many cryptography keys are used. The classification system requires server logic to respond to license requests by returning appropriate License instances. Different classification systems are free to define what the cookie data is added to content and how to use this information in a server when responding with license details. For example, the Context classification system embeds a Context Cookie into sealed content. The context classification system also defines that for each context, one or more cryptography key sets can be used. One of these key sets is marked as the active one that is used to seal all new content. Licenses are obtained by assigning a role to a user or group, defining what rights are available within a context.
 *                     
 * 
 * <p>Java class for ClassificationSystemRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassificationSystemRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationSystemRef", propOrder = {
    "uuid"
})
public class ClassificationSystemRef {

    @XmlElement(required = true)
    protected String uuid;

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

}
