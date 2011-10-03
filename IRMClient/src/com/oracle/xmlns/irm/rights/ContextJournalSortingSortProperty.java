
package com.oracle.xmlns.irm.rights;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextJournalSorting_SortProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContextJournalSorting_SortProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="TIME"/>
 *     &lt;enumeration value="STATUS"/>
 *     &lt;enumeration value="ACCOUNT"/>
 *     &lt;enumeration value="FEATURE"/>
 *     &lt;enumeration value="URI"/>
 *     &lt;enumeration value="DEVICE"/>
 *     &lt;enumeration value="CONTEXT"/>
 *     &lt;enumeration value="ITEM_CODE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContextJournalSorting_SortProperty")
@XmlEnum
public enum ContextJournalSortingSortProperty {


    /**
     * 
     *                         Default sort order. The order returned from the persistent storage of context journal entries.
     *                     
     * 
     */
    NONE,

    /**
     * 
     *                         Sort on time. The result set is sorted based on the context journal entry Time property.
     *                     
     * 
     */
    TIME,

    /**
     * 
     *                         Sort on status. The result set is sorted on the context journal entry Status property.
     *                     
     * 
     */
    STATUS,

    /**
     * 
     *                         Sort on account name. The result set is sorted on the context journal entry Account property. The sort is performed on the account Account Name.
     *                     
     * 
     */
    ACCOUNT,

    /**
     * 
     *                         Sort on feature. The result set is sorted on the context journal entry Feature property. The sort is performed on the feature Id.
     *                     
     * 
     */
    FEATURE,

    /**
     * 
     *                         Sort on URI. The result set is sorted on the context journal entry URI property.
     *                     
     * 
     */
    URI,

    /**
     * 
     *                         Sort on device. The result set is sorted on the context journal entry Device property. The sort is performed on the device Name.
     *                     
     * 
     */
    DEVICE,

    /**
     * 
     *                         Sort on context. The result set is sorted on the context journal entry Context Instance property. The sort is performed on Uuid of the context instance.
     *                     
     * 
     */
    CONTEXT,

    /**
     * 
     *                         Sort on item code. The result set is sorted on the context journal entry Item Code property. The sort is performed on Value of the item code with a secondary sort on the Time property.
     *                     
     * 
     */
    ITEM_CODE;

    public String value() {
        return name();
    }

    public static ContextJournalSortingSortProperty fromValue(String v) {
        return valueOf(v);
    }

}
