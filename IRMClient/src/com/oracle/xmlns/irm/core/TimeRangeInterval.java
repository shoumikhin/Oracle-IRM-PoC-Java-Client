
package com.oracle.xmlns.irm.core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeRange_Interval.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeRange_Interval">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SECOND"/>
 *     &lt;enumeration value="MINUTE"/>
 *     &lt;enumeration value="HOUR"/>
 *     &lt;enumeration value="DAY"/>
 *     &lt;enumeration value="WEEK"/>
 *     &lt;enumeration value="MONTH"/>
 *     &lt;enumeration value="YEAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeRange_Interval")
@XmlEnum
public enum TimeRangeInterval {


    /**
     * 
     *                         Seconds. 
     *                     
     * 
     */
    SECOND,

    /**
     * 
     *                         Minutes. 
     *                     
     * 
     */
    MINUTE,

    /**
     * 
     *                         Hours. 
     *                     
     * 
     */
    HOUR,

    /**
     * 
     *                         Days. 
     *                     
     * 
     */
    DAY,

    /**
     * 
     *                         Weeks. 
     *                     
     * 
     */
    WEEK,

    /**
     * 
     *                         Months. 
     *                     
     * 
     */
    MONTH,

    /**
     * 
     *                         Years. 
     *                     
     * 
     */
    YEAR;

    public String value() {
        return name();
    }

    public static TimeRangeInterval fromValue(String v) {
        return valueOf(v);
    }

}
