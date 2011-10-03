
package com.oracle.xmlns.irm.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.irm.content.KeySetExtensions;


/**
 * 
 *                         Desktop key exchange content and signing keys. Desktop key set extensions can be used to associate a set of encrypted symmetric keys with a key set for use in exchanging keys in a Desktop Bundle.
 *                     
 * 
 * <p>Java class for DesktopKeySetExtensions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesktopKeySetExtensions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/irm/content}KeySetExtensions">
 *       &lt;sequence>
 *         &lt;element name="identityToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="encryptedContentKey" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="encryptedSigningKey" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DesktopKeySetExtensions", propOrder = {
    "identityToken",
    "encryptedContentKey",
    "encryptedSigningKey"
})
public class DesktopKeySetExtensions
    extends KeySetExtensions
{

    @XmlElement(required = true)
    protected String identityToken;
    @XmlElement(required = true)
    protected byte[] encryptedContentKey;
    @XmlElement(required = true)
    protected byte[] encryptedSigningKey;

    /**
     * Gets the value of the identityToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityToken() {
        return identityToken;
    }

    /**
     * Sets the value of the identityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityToken(String value) {
        this.identityToken = value;
    }

    /**
     * Gets the value of the encryptedContentKey property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEncryptedContentKey() {
        return encryptedContentKey;
    }

    /**
     * Sets the value of the encryptedContentKey property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEncryptedContentKey(byte[] value) {
        this.encryptedContentKey = ((byte[]) value);
    }

    /**
     * Gets the value of the encryptedSigningKey property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEncryptedSigningKey() {
        return encryptedSigningKey;
    }

    /**
     * Sets the value of the encryptedSigningKey property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEncryptedSigningKey(byte[] value) {
        this.encryptedSigningKey = ((byte[]) value);
    }

}
