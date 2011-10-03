
package com.oracle.xmlns.irm.rights;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextTemplate_Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContextTemplate_Status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="ACTIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContextTemplate_Status")
@XmlEnum
public enum ContextTemplateStatus {


    /**
     * 
     *                         Inactive template. 
     *                     
     * 
     */
    INACTIVE,

    /**
     * 
     *                         Active template. 
     *                     
     * 
     */
    ACTIVE;

    public String value() {
        return name();
    }

    public static ContextTemplateStatus fromValue(String v) {
        return valueOf(v);
    }

}
