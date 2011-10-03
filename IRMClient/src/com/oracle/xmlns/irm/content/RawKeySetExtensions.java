
package com.oracle.xmlns.irm.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Raw content encryption and signing keys. A raw key set extensions can be used to associate a raw set of symmetric keys with a key set. Useful in the key set information needs to be serialized out, say in XML, in a unprotected form (the keys are in the clear).
 *                     
 * 
 * <p>Java class for RawKeySetExtensions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RawKeySetExtensions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/irm/content}KeySetExtensions">
 *       &lt;sequence>
 *         &lt;element name="encryptionKey" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="signingKey" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RawKeySetExtensions", propOrder = {
    "encryptionKey",
    "signingKey"
})
public class RawKeySetExtensions
    extends KeySetExtensions
{

    @XmlElement(required = true)
    protected byte[] encryptionKey;
    @XmlElement(required = true)
    protected byte[] signingKey;

    /**
     * Gets the value of the encryptionKey property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * Sets the value of the encryptionKey property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEncryptionKey(byte[] value) {
        this.encryptionKey = ((byte[]) value);
    }

    /**
     * Gets the value of the signingKey property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSigningKey() {
        return signingKey;
    }

    /**
     * Sets the value of the signingKey property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSigningKey(byte[] value) {
        this.signingKey = ((byte[]) value);
    }

}
