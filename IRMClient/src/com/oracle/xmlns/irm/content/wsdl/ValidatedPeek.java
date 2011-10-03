
package com.oracle.xmlns.irm.content.wsdl;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                             Peek sealed content (with validation of the signature). Peeking is the process of extracting the meta-data added to sealed content. This variant attempts to check the public header against its declared signature. If the public header meta-data has been altered post sealing this method will throw an exception. A validated peek is allowed if the authenticated user has a license that has the open Feature for the content's Classification. The peeking process only examines the start of the sealed content. If a file is large it is not necessary to send the complete content, just the start of the file that contains the public header XML and signature. This can improve performance when peeking large files.
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
 *         &lt;element name="input" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
    "input"
})
@XmlRootElement(name = "ValidatedPeek")
public class ValidatedPeek {

    @XmlElement(required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler input;

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setInput(DataHandler value) {
        this.input = value;
    }

}
