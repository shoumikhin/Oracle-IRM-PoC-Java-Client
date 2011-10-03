
package com.oracle.xmlns.irm.classifications;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemConstraints_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemConstraints_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LOCKS"/>
 *     &lt;enumeration value="EXCLUSIONS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemConstraints_Type")
@XmlEnum
public enum ItemConstraintsType {


    /**
     * 
     *                         Item locks. The Item Codes are interpreted as a list of allowed items.
     *                     
     * 
     */
    LOCKS,

    /**
     * 
     *                         Item exclusions. The Item Codes are interpreted as a list of disallowed items.
     *                     
     * 
     */
    EXCLUSIONS;

    public String value() {
        return name();
    }

    public static ItemConstraintsType fromValue(String v) {
        return valueOf(v);
    }

}
