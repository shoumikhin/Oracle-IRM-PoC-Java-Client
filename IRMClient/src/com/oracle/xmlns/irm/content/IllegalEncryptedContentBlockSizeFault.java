
package com.oracle.xmlns.irm.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         Illegal encrypted content block size. When performing a sealing operation, content encryption options can be supplied that control the size of the encrypted content blocks. The encrypted content block size must be a multiple of the cipher block size. The cipher block size relates to the Crypto Schema involved in the sealing process. This restriction on encrypted content block sizes allows the sealing process to work with block based ciphers as well as streaming ciphers.
 *                     
 * 
 * <p>Java class for IllegalEncryptedContentBlockSizeFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IllegalEncryptedContentBlockSizeFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blockSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "IllegalEncryptedContentBlockSizeFault", propOrder = {
    "blockSize",
    "encryptedContentBlockSize"
})
public class IllegalEncryptedContentBlockSizeFault {

    protected int blockSize;
    protected int encryptedContentBlockSize;

    /**
     * Gets the value of the blockSize property.
     * 
     */
    public int getBlockSize() {
        return blockSize;
    }

    /**
     * Sets the value of the blockSize property.
     * 
     */
    public void setBlockSize(int value) {
        this.blockSize = value;
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
