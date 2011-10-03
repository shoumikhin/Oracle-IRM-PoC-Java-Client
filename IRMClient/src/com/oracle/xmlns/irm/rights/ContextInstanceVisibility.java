
package com.oracle.xmlns.irm.rights;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextInstance_Visibility.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContextInstance_Visibility">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DOMAIN"/>
 *     &lt;enumeration value="CONTEXT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContextInstance_Visibility")
@XmlEnum
public enum ContextInstanceVisibility {


    /**
     * 
     *                         Context visible to inspectors and context managers. 
     *                     
     * 
     */
    DOMAIN,

    /**
     * 
     *                         Context visible to context managers only. 
     *                     
     * 
     */
    CONTEXT;

    public String value() {
        return name();
    }

    public static ContextInstanceVisibility fromValue(String v) {
        return valueOf(v);
    }

}
