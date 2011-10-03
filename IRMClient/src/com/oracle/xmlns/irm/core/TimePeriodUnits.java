
package com.oracle.xmlns.irm.core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimePeriod_Units.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimePeriod_Units">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SECONDS"/>
 *     &lt;enumeration value="MINUTES"/>
 *     &lt;enumeration value="HOURS"/>
 *     &lt;enumeration value="DAYS"/>
 *     &lt;enumeration value="MONTHS"/>
 *     &lt;enumeration value="YEARS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimePeriod_Units")
@XmlEnum
public enum TimePeriodUnits {


    /**
     * 
     *                         Seconds. 
     *                     
     * 
     */
    SECONDS,

    /**
     * 
     *                         Minutes. 
     *                     
     * 
     */
    MINUTES,

    /**
     * 
     *                         Hours. 
     *                     
     * 
     */
    HOURS,

    /**
     * 
     *                         Days. 
     *                     
     * 
     */
    DAYS,

    /**
     * 
     *                         Months. 
     *                     
     * 
     */
    MONTHS,

    /**
     * 
     *                         Years. 
     *                     
     * 
     */
    YEARS;

    public String value() {
        return name();
    }

    public static TimePeriodUnits fromValue(String v) {
        return valueOf(v);
    }

}
