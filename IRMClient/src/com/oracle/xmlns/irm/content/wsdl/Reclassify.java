
package com.oracle.xmlns.irm.content.wsdl;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.irm.core.Classification;


/**
 * 
 *                             Re-classify sealed content. Re-classification is the process of altering the Classification of the sealed content without having to perform a two step unseal and seal. During re-classification the content is re-encrypted and re-signed. If the classification labels or key set are not provided then the sealing process will attempt to fill in these details. If no labels are provided in the classification the labels are filled in automatically. Labels can only be filled in if provided classification Id matches the classification returned by the server. If no key set is provided then the key set is filled in from the license used to perform the sealing operation. If the license specifies multiple key sets then the first key set in the license is used. To perform a resealing operation the authenticated user must have a license for both the source classification and the target classification. The source classification license must allow the oracle.irm.generic.CopyTo or oracle.irm.generic.SaveUnsealed Feature. The target classification license must allow the oracle.irm.generic.Seal feature. If the source license has a copy to feature the transformation is only permitted if target classification is allowed by the trusted Destinations of the source classification license. If the source license has a save unsealed feature then there are no restrictions on the target classification.
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
 *         &lt;element name="classification" type="{http://xmlns.oracle.com/irm/core}Classification"/>
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
    "input",
    "classification"
})
@XmlRootElement(name = "Reclassify")
public class Reclassify {

    @XmlElement(required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler input;
    @XmlElement(required = true)
    protected Classification classification;

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

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link Classification }
     *     
     */
    public Classification getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Classification }
     *     
     */
    public void setClassification(Classification value) {
        this.classification = value;
    }

}
