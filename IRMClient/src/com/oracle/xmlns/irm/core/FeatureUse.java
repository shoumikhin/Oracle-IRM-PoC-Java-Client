
package com.oracle.xmlns.irm.core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Feature_Use.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Feature_Use">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IMMEDIATE"/>
 *     &lt;enumeration value="DEMAND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Feature_Use")
@XmlEnum
public enum FeatureUse {


    /**
     * 
     *                         Used immediately. 
     *                     
     * 
     */
    IMMEDIATE,

    /**
     * 
     *                         Used on demand. 
     *                     
     * 
     */
    DEMAND;

    public String value() {
        return name();
    }

    public static FeatureUse fromValue(String v) {
        return valueOf(v);
    }

}
