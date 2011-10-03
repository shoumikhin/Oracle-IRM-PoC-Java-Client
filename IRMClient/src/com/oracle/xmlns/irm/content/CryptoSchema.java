
package com.oracle.xmlns.irm.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Sealed content cryptography schema. A cryptography schema is used to link a Key Set with the set of cryptography algorithms used when working with that key set. A cryptography schema must be specified when creating a key set. The schema defines what types of cryptography key are generated and what key sizes are used. The cryptography schema is also used (via the key set) when sealing or unsealing content. When performing operations such as sealing or unsealing the schema defines what algorithms are used for encrypting (and decrypting) the content, signing the content and calculating digests.
 *                     
 * 
 * <p>Java class for CryptoSchema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CryptoSchema">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="encryptionTransformation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="encryptionKeySize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hmacSigningAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hmacSigningKeySize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="digestAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sessionKeyEncryptionTransformation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sessionKeyEncryptionKeySize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="useFips" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoSchema", propOrder = {
    "id",
    "encryptionTransformation",
    "encryptionKeySize",
    "hmacSigningAlgorithm",
    "hmacSigningKeySize",
    "digestAlgorithm",
    "sessionKeyEncryptionTransformation",
    "sessionKeyEncryptionKeySize",
    "useFips"
})
public class CryptoSchema {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String encryptionTransformation;
    protected int encryptionKeySize;
    @XmlElement(required = true)
    protected String hmacSigningAlgorithm;
    protected int hmacSigningKeySize;
    @XmlElement(required = true)
    protected String digestAlgorithm;
    @XmlElement(required = true)
    protected String sessionKeyEncryptionTransformation;
    protected int sessionKeyEncryptionKeySize;
    protected boolean useFips;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the encryptionTransformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionTransformation() {
        return encryptionTransformation;
    }

    /**
     * Sets the value of the encryptionTransformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionTransformation(String value) {
        this.encryptionTransformation = value;
    }

    /**
     * Gets the value of the encryptionKeySize property.
     * 
     */
    public int getEncryptionKeySize() {
        return encryptionKeySize;
    }

    /**
     * Sets the value of the encryptionKeySize property.
     * 
     */
    public void setEncryptionKeySize(int value) {
        this.encryptionKeySize = value;
    }

    /**
     * Gets the value of the hmacSigningAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHmacSigningAlgorithm() {
        return hmacSigningAlgorithm;
    }

    /**
     * Sets the value of the hmacSigningAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHmacSigningAlgorithm(String value) {
        this.hmacSigningAlgorithm = value;
    }

    /**
     * Gets the value of the hmacSigningKeySize property.
     * 
     */
    public int getHmacSigningKeySize() {
        return hmacSigningKeySize;
    }

    /**
     * Sets the value of the hmacSigningKeySize property.
     * 
     */
    public void setHmacSigningKeySize(int value) {
        this.hmacSigningKeySize = value;
    }

    /**
     * Gets the value of the digestAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigestAlgorithm() {
        return digestAlgorithm;
    }

    /**
     * Sets the value of the digestAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigestAlgorithm(String value) {
        this.digestAlgorithm = value;
    }

    /**
     * Gets the value of the sessionKeyEncryptionTransformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionKeyEncryptionTransformation() {
        return sessionKeyEncryptionTransformation;
    }

    /**
     * Sets the value of the sessionKeyEncryptionTransformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionKeyEncryptionTransformation(String value) {
        this.sessionKeyEncryptionTransformation = value;
    }

    /**
     * Gets the value of the sessionKeyEncryptionKeySize property.
     * 
     */
    public int getSessionKeyEncryptionKeySize() {
        return sessionKeyEncryptionKeySize;
    }

    /**
     * Sets the value of the sessionKeyEncryptionKeySize property.
     * 
     */
    public void setSessionKeyEncryptionKeySize(int value) {
        this.sessionKeyEncryptionKeySize = value;
    }

    /**
     * Gets the value of the useFips property.
     * 
     */
    public boolean isUseFips() {
        return useFips;
    }

    /**
     * Sets the value of the useFips property.
     * 
     */
    public void setUseFips(boolean value) {
        this.useFips = value;
    }

}
