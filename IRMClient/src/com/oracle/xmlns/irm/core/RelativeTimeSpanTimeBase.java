
package com.oracle.xmlns.irm.core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelativeTimeSpan_TimeBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelativeTimeSpan_TimeBase">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLASSIFICATION"/>
 *     &lt;enumeration value="LICENSE"/>
 *     &lt;enumeration value="REQUEST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelativeTimeSpan_TimeBase")
@XmlEnum
public enum RelativeTimeSpanTimeBase {


    /**
     * 
     *                         Relative to classification time. 
     *                     
     * 
     */
    CLASSIFICATION,

    /**
     * 
     *                         Relative to license creation time. 
     *                     
     * 
     */
    LICENSE,

    /**
     * 
     *                         Relative to license request time. 
     *                     
     * 
     */
    REQUEST;

    public String value() {
        return name();
    }

    public static RelativeTimeSpanTimeBase fromValue(String v) {
        return valueOf(v);
    }

}
