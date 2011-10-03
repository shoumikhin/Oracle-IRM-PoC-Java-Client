
package com.oracle.xmlns.irm.core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseCriteria_Delivery.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LicenseCriteria_Delivery">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SYNCHRONIZATION"/>
 *     &lt;enumeration value="ON_DEMAND"/>
 *     &lt;enumeration value="CLIENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LicenseCriteria_Delivery")
@XmlEnum
public enum LicenseCriteriaDelivery {


    /**
     * 
     *                         License can be delivered during synchronization. Licenses of this type can also be requested on-demand. This allows licenses to be requested in-between synchronizations.
     *                     
     * 
     */
    SYNCHRONIZATION,

    /**
     * 
     *                         License can be delivered only on-demand. This is typically the delivery mechanism for licenses that are Transient or have time constraints that are relative to request time. Licenses of this type are not picked up during synchronization.
     *                     
     * 
     */
    ON_DEMAND,

    /**
     * 
     *                         License is created and controlled by the client. This is a delivery mechanism used entirely on the client. The IRM client sometimes needs to make small, longer-lifetime, copies of a license to handle specific situations. These licenses are not synchronized with, nor refreshed against, the IRM server.
     *                     
     * 
     */
    CLIENT;

    public String value() {
        return name();
    }

    public static LicenseCriteriaDelivery fromValue(String v) {
        return valueOf(v);
    }

}
