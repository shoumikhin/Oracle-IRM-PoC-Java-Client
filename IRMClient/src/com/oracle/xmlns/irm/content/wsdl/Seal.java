
package com.oracle.xmlns.irm.content.wsdl;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.irm.content.SealingOptions;


/**
 * 
 *                             Seal content. Sealing is the process of taking plaintext content, encrypting and signing the content with an associated Classification. If the classification provided is a context classification system classification, this method will provide an automatic Item Code if one is not specified in the classification details. To perform a sealing operation the authenticated user must have the rights to seal content for the specified classification. Sealing is authorized if the authenticated user has a license that allows the oracle.irm.generic.Seal Feature for the Classification specified in the sealing options.
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
 *         &lt;element name="stream" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="mimeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="options" type="{http://xmlns.oracle.com/irm/content}SealingOptions"/>
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
    "stream",
    "mimeType",
    "options"
})
@XmlRootElement(name = "Seal")
public class Seal {

    @XmlElement(required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler stream;
    @XmlElement(required = true)
    protected String mimeType;
    @XmlElement(required = true)
    protected SealingOptions options;

    /**
     * Gets the value of the stream property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getStream() {
        return stream;
    }

    /**
     * Sets the value of the stream property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setStream(DataHandler value) {
        this.stream = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link SealingOptions }
     *     
     */
    public SealingOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link SealingOptions }
     *     
     */
    public void setOptions(SealingOptions value) {
        this.options = value;
    }

}
