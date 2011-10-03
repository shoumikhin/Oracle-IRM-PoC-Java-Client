
package com.oracle.xmlns.irm.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Schema version information for sealed content. When content is sealed, it is sealed against a schema. This schema defines the format of the sealed content. The desktop will support opening content for all the schemas it is aware of. If tries to open content for a schema it does not support it will prompt the user to upgrade their desktop installation. The content schema stores the schema number and the minimum desktop version required to work with that schema version.
 *                     
 * 
 * <p>Java class for ContentSchema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentSchema">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="schemaVersion" type="{http://xmlns.oracle.com/irm/content}SchemaVersion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentSchema", propOrder = {
    "schemaVersion"
})
public class ContentSchema {

    @XmlElement(required = true)
    protected SchemaVersion schemaVersion;

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaVersion }
     *     
     */
    public SchemaVersion getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaVersion }
     *     
     */
    public void setSchemaVersion(SchemaVersion value) {
        this.schemaVersion = value;
    }

}
