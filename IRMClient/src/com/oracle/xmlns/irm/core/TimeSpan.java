
package com.oracle.xmlns.irm.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         A time span. A time span can have an optional start and stop time and a flexible time reference point.
 *                     
 * 
 * <p>Java class for TimeSpan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSpan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referencePoint" type="{http://xmlns.oracle.com/irm/core}TimeSpan_ReferencePoint"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSpan", propOrder = {
    "referencePoint"
})
@XmlSeeAlso({
    AbsoluteTimeSpan.class,
    RelativeTimeSpan.class
})
public abstract class TimeSpan {

    @XmlElement(required = true)
    protected TimeSpanReferencePoint referencePoint;

    /**
     * Gets the value of the referencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpanReferencePoint }
     *     
     */
    public TimeSpanReferencePoint getReferencePoint() {
        return referencePoint;
    }

    /**
     * Sets the value of the referencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpanReferencePoint }
     *     
     */
    public void setReferencePoint(TimeSpanReferencePoint value) {
        this.referencePoint = value;
    }

}
