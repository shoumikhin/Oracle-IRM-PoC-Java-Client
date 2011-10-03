
package com.oracle.xmlns.irm.core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeSpan_ReferencePoint.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeSpan_ReferencePoint">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CURRENT"/>
 *     &lt;enumeration value="CLASSIFICATION"/>
 *     &lt;enumeration value="LICENSE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeSpan_ReferencePoint")
@XmlEnum
public enum TimeSpanReferencePoint {


    /**
     * 
     *                         Current time. Compare the time span against current time.
     *                     
     * 
     */
    CURRENT,

    /**
     * 
     *                         Classification time. Compare the time span against time the classification was applied (Classification Time).
     *                     
     * 
     */
    CLASSIFICATION,

    /**
     * 
     *                         License time. Compare the time span against time the license was granted (License Time).
     *                     
     * 
     */
    LICENSE;

    public String value() {
        return name();
    }

    public static TimeSpanReferencePoint fromValue(String v) {
        return valueOf(v);
    }

}
