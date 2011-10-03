
package com.oracle.xmlns.irm.content.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.irm.content.CustomData;


/**
 * 
 *                             Reseal content with new custom data. Resealing is the process of altering the data or meta-data in sealed content. This method allows the custom data portion of the meta data to be replaced. To perform a resealing operation the authenticated user must have the rights to reseal the content. Resealing is allowed if the authenticated user has a valid license that has the oracle.irm.generic.Reseal Feature for the content's Classification.
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
 *         &lt;element name="customData" type="{http://xmlns.oracle.com/irm/content}CustomData" maxOccurs="unbounded" minOccurs="0"/>
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
    "customData"
})
@XmlRootElement(name = "Reseal")
public class Reseal {

    @XmlElement(required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler input;
    protected List<CustomData> customData;

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
     * Gets the value of the customData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomData }
     * 
     * 
     */
    public List<CustomData> getCustomData() {
        if (customData == null) {
            customData = new ArrayList<CustomData>();
        }
        return this.customData;
    }

}
