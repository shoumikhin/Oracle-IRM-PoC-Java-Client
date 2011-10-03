
package com.oracle.xmlns.irm.core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeRange_Direction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeRange_Direction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FORWARD"/>
 *     &lt;enumeration value="BACKWARD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeRange_Direction")
@XmlEnum
public enum TimeRangeDirection {


    /**
     * 
     *                         Forward in time. 
     *                     
     * 
     */
    FORWARD,

    /**
     * 
     *                         Backward in time. 
     *                     
     * 
     */
    BACKWARD;

    public String value() {
        return name();
    }

    public static TimeRangeDirection fromValue(String v) {
        return valueOf(v);
    }

}
