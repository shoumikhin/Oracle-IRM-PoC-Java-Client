
package com.oracle.xmlns.irm.rights;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextJournalSorting_SortOrder.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContextJournalSorting_SortOrder">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASCENDING"/>
 *     &lt;enumeration value="DESCENDING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContextJournalSorting_SortOrder")
@XmlEnum
public enum ContextJournalSortingSortOrder {


    /**
     * 
     *                         Ascending order. 
     *                     
     * 
     */
    ASCENDING,

    /**
     * 
     *                         Descending order. 
     *                     
     * 
     */
    DESCENDING;

    public String value() {
        return name();
    }

    public static ContextJournalSortingSortOrder fromValue(String v) {
        return valueOf(v);
    }

}
