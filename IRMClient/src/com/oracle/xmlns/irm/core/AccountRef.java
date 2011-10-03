
package com.oracle.xmlns.irm.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         A user or group identifier. An account is the information required to identity a user or group stored in an external user store - such as LDAP. The data identifying a user or group is a UUID or GUID value. When internal operations ask for user or group related data (such as looking up licenses for a user) the user or group is identified by this UUID value. When referencing a user or group providing a UUID or GUID value in the format used by the user store can be problematic as the UUID or GUID value is not always easy to obtain. Referencing a user or group is made easier by the following alternative mechanisms. User Name. To identify a user by name provide a URN in the format urn:user:name where name is the user name. This format requires the user name to be URL encoded. e.g. for user bob smith the URN would be urn:user:bob%20smith. Group Name. To identify a group by name provide a URN in the format urn:group:name where name is the group name. This format requires the group name to be URL encoded. e.g. for group board of directors the URN would be urn:group:board%20of%20directors. UUID. To identify the user by UUID provide the raw uuid value as used by the user store. e.g. 4687dcb0-8b6e-4bc8-b65c-a8845c7e1e00.
 *                     
 * 
 * <p>Java class for AccountRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountRef">
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
@XmlType(name = "AccountRef", propOrder = {
    "uuid"
})
public class AccountRef {

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
