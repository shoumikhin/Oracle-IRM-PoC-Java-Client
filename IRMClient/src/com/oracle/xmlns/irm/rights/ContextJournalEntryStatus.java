
package com.oracle.xmlns.irm.rights;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextJournalEntry_Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContextJournalEntry_Status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="FAILURE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContextJournalEntry_Status")
@XmlEnum
public enum ContextJournalEntryStatus {


    /**
     * 
     *                         Success. A failure indicates the action was attempted and completed.
     *                     
     * 
     */
    SUCCESS,

    /**
     * 
     *                         Failure. A failure indicates the action was attempted but could not be completed.
     *                     
     * 
     */
    FAILURE;

    public String value() {
        return name();
    }

    public static ContextJournalEntryStatus fromValue(String v) {
        return valueOf(v);
    }

}
