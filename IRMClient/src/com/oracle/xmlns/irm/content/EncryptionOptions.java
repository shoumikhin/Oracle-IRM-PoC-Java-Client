
package com.oracle.xmlns.irm.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Encryption options for sealing content. The most common use of this class is to alter the size of the encrypted content blocks in the sealed file. Note that most of the important parameters (algorithm, key-size, etc.) are determined by the choice of Crypto Schema associated with the classification.
 *                     
 * 
 * <p>Java class for EncryptionOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncryptionOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publicHeaderPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="encryptedContentBlockSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptionOptions", propOrder = {
    "publicHeaderPeriod",
    "encryptedContentBlockSize"
})
public class EncryptionOptions {

    protected int publicHeaderPeriod;
    protected int encryptedContentBlockSize;

    /**
     * Gets the value of the publicHeaderPeriod property.
     * 
     */
    public int getPublicHeaderPeriod() {
        return publicHeaderPeriod;
    }

    /**
     * Sets the value of the publicHeaderPeriod property.
     * 
     */
    public void setPublicHeaderPeriod(int value) {
        this.publicHeaderPeriod = value;
    }

    /**
     * Gets the value of the encryptedContentBlockSize property.
     * 
     */
    public int getEncryptedContentBlockSize() {
        return encryptedContentBlockSize;
    }

    /**
     * Sets the value of the encryptedContentBlockSize property.
     * 
     */
    public void setEncryptedContentBlockSize(int value) {
        this.encryptedContentBlockSize = value;
    }

}
