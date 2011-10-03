
package com.oracle.xmlns.irm.core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseCriteria_Use.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LicenseCriteria_Use">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRIMARY"/>
 *     &lt;enumeration value="SECONDARY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LicenseCriteria_Use")
@XmlEnum
public enum LicenseCriteriaUse {


    /**
     * 
     *                         Primary use. 
     *                     
     * 
     */
    PRIMARY,

    /**
     * 
     *                         Secondary use. License will be typically requested on demand because of explicit use of an application feature. e.g printing. As a secondary license is used within the scope of a primary license, the secondary license will not cause a session to expire, but once out of a session the licenses will expire as normal.
     *                     
     * 
     */
    SECONDARY;

    public String value() {
        return name();
    }

    public static LicenseCriteriaUse fromValue(String v) {
        return valueOf(v);
    }

}
