
package com.oracle.xmlns.irm.core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Feature_Support.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Feature_Support">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AVAILABLE"/>
 *     &lt;enumeration value="ON_DEMAND"/>
 *     &lt;enumeration value="UNAVAILABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Feature_Support")
@XmlEnum
public enum FeatureSupport {


    /**
     * 
     *                         Available. The feature is available for use.
     *                     
     * 
     */
    AVAILABLE,

    /**
     * 
     *                         Available, but on-demand. The feature may be available, but must be obtained before it can be used.
     *                     
     * 
     */
    ON_DEMAND,

    /**
     * 
     *                         Unavailable. The feature is unavailable for use.
     *                     
     * 
     */
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static FeatureSupport fromValue(String v) {
        return valueOf(v);
    }

}
