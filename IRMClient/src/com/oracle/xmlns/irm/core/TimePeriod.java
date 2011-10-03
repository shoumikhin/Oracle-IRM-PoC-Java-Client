
package com.oracle.xmlns.irm.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         A definition of a length of time. A time period stores a period of time as a numeric value and the time units - years, days, hours, minutes or seconds. A time period can have a positive or negative value - indicating the direction of the time period. A negative time period amount would mean that the time period is in the past, a positive time period would mean the time period is in the future.
 *                     
 * 
 * <p>Java class for TimePeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimePeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="units" type="{http://xmlns.oracle.com/irm/core}TimePeriod_Units"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriod", propOrder = {
    "amount",
    "units"
})
public class TimePeriod {

    protected int amount;
    @XmlElement(required = true)
    protected TimePeriodUnits units;

    /**
     * Gets the value of the amount property.
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodUnits }
     *     
     */
    public TimePeriodUnits getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodUnits }
     *     
     */
    public void setUnits(TimePeriodUnits value) {
        this.units = value;
    }

}
