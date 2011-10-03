
package com.oracle.xmlns.irm.rights;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentRole_TimeConstraints.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentRole_TimeConstraints">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="ABSOLUTE"/>
 *     &lt;enumeration value="RELATIVE_ASSIGNMENT"/>
 *     &lt;enumeration value="RELATIVE_CLASSIFICATION"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentRole_TimeConstraints")
@XmlEnum
public enum DocumentRoleTimeConstraints {


    /**
     * 
     *                         No time constraints. 
     *                     
     * 
     */
    NONE,

    /**
     * 
     *                         Absolute time constraint. 
     *                     
     * 
     */
    ABSOLUTE,

    /**
     * 
     *                         Relative assignment time constraint. 
     *                     
     * 
     */
    RELATIVE_ASSIGNMENT,

    /**
     * 
     *                         Relative classification time constraint. 
     *                     
     * 
     */
    RELATIVE_CLASSIFICATION,

    /**
     * 
     *                         Other time constraints not part of the common use cases. 
     *                     
     * 
     */
    OTHER;

    public String value() {
        return name();
    }

    public static DocumentRoleTimeConstraints fromValue(String v) {
        return valueOf(v);
    }

}
