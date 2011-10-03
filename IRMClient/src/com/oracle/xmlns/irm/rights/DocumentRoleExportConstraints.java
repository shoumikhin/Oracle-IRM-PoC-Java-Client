
package com.oracle.xmlns.irm.rights;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentRole_ExportConstraints.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentRole_ExportConstraints">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FULL"/>
 *     &lt;enumeration value="TRUSTED"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentRole_ExportConstraints")
@XmlEnum
public enum DocumentRoleExportConstraints {


    /**
     * 
     *                         Fully constrained. Content cannot be resealing or copied. Copying within the same document is permitted.
     *                     
     * 
     */
    FULL,

    /**
     * 
     *                         Constrained to trusted classifications. Allows content to be resealed or copied to the classifications specified in role's classification Destinations. Copying within the same document is permitted.
     *                     
     * 
     */
    TRUSTED,

    /**
     * 
     *                         No constraints. Allows content to be resealed to any classification, copied into the clear or saved in unsealed form.
     *                     
     * 
     */
    NONE;

    public String value() {
        return name();
    }

    public static DocumentRoleExportConstraints fromValue(String v) {
        return valueOf(v);
    }

}
