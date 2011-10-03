
package com.oracle.xmlns.irm.core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseCriteria_Storage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LicenseCriteria_Storage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PERSISTENT"/>
 *     &lt;enumeration value="TRANSIENT"/>
 *     &lt;enumeration value="ANY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LicenseCriteria_Storage")
@XmlEnum
public enum LicenseCriteriaStorage {


    /**
     * 
     *                         License can be stored on disk or memory. 
     *                     
     * 
     */
    PERSISTENT,

    /**
     * 
     *                         License can only be stored in memory. 
     *                     
     * 
     */
    TRANSIENT,

    /**
     * 
     *                         License can be stored in either memory or on disk. 
     *                     
     * 
     */
    ANY;

    public String value() {
        return name();
    }

    public static LicenseCriteriaStorage fromValue(String v) {
        return valueOf(v);
    }

}
