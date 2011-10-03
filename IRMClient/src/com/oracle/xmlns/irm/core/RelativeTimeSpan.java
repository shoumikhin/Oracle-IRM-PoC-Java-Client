
package com.oracle.xmlns.irm.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         A relative time span. A relative time span defines a start time and stop time that is relative to an absolute point in time.
 *                     
 * 
 * <p>Java class for RelativeTimeSpan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelativeTimeSpan">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/irm/core}TimeSpan">
 *       &lt;sequence>
 *         &lt;element name="timeBase" type="{http://xmlns.oracle.com/irm/core}RelativeTimeSpan_TimeBase"/>
 *         &lt;element name="startTime" type="{http://xmlns.oracle.com/irm/core}TimePeriod" minOccurs="0"/>
 *         &lt;element name="stopTime" type="{http://xmlns.oracle.com/irm/core}TimePeriod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativeTimeSpan", propOrder = {
    "timeBase",
    "startTime",
    "stopTime"
})
public class RelativeTimeSpan
    extends TimeSpan
{

    @XmlElement(required = true)
    protected RelativeTimeSpanTimeBase timeBase;
    protected TimePeriod startTime;
    protected TimePeriod stopTime;

    /**
     * Gets the value of the timeBase property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeTimeSpanTimeBase }
     *     
     */
    public RelativeTimeSpanTimeBase getTimeBase() {
        return timeBase;
    }

    /**
     * Sets the value of the timeBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeTimeSpanTimeBase }
     *     
     */
    public void setTimeBase(RelativeTimeSpanTimeBase value) {
        this.timeBase = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setStartTime(TimePeriod value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the stopTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getStopTime() {
        return stopTime;
    }

    /**
     * Sets the value of the stopTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setStopTime(TimePeriod value) {
        this.stopTime = value;
    }

}
