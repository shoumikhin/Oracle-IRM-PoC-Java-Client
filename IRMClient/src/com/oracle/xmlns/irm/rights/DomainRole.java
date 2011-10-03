
package com.oracle.xmlns.irm.rights;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Domain_Role.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Domain_Role">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="ADMINISTRATOR"/>
 *     &lt;enumeration value="MANAGER"/>
 *     &lt;enumeration value="INSPECTOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Domain_Role")
@XmlEnum
public enum DomainRole {


    /**
     * 
     *                         None. 
     *                     
     * 
     */
    NONE,

    /**
     * 
     *                         Administrator. 
     *                     
     * 
     */
    ADMINISTRATOR,

    /**
     * 
     *                         Manager. 
     *                     
     * 
     */
    MANAGER,

    /**
     * 
     *                         Inspector. 
     *                     
     * 
     */
    INSPECTOR;

    public String value() {
        return name();
    }

    public static DomainRole fromValue(String v) {
        return valueOf(v);
    }

}
