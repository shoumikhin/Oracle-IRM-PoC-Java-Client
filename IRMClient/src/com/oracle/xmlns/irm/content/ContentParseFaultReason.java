
package com.oracle.xmlns.irm.content;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentParseFault_Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentParseFault_Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONTENT_TRUNCATED"/>
 *     &lt;enumeration value="XML_BLOCK_INVALID_SIZE"/>
 *     &lt;enumeration value="XML_BLOCK_EMPTY"/>
 *     &lt;enumeration value="XML_BLOCK_TRUNCATED"/>
 *     &lt;enumeration value="PREAMBLE_NOT_FOUND"/>
 *     &lt;enumeration value="MAGIC_NOT_FOUND"/>
 *     &lt;enumeration value="PUBLIC_HEADER_MISSING"/>
 *     &lt;enumeration value="PUBLIC_HEADER_CORRUPT"/>
 *     &lt;enumeration value="PUBLIC_HEADER_SIGNATURE_MISMATCH"/>
 *     &lt;enumeration value="PUBLIC_HEADER_SIGNATURE_MISSING"/>
 *     &lt;enumeration value="PUBLIC_HEADER_SIGNATURE_CORRUPT"/>
 *     &lt;enumeration value="PUBLIC_HEADER_DATA_DIGEST_MISMATCH"/>
 *     &lt;enumeration value="PRIVATE_BLOCK_DIGEST_MISMATCH"/>
 *     &lt;enumeration value="PRIVATE_HEADER_CORRUPT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentParseFault_Reason")
@XmlEnum
public enum ContentParseFaultReason {


    /**
     * 
     *                         Truncated sealed content. The end of sealed content was encountered when more data was expected.
     *                     
     * 
     */
    CONTENT_TRUNCATED,

    /**
     * 
     *                         An XML block in sealed content has an invalid size. When reading XML from sealed content the size of the XML is written into the file. This error code indicates the size read is invalid (e.g. negative or too large a value).
     *                     
     * 
     */
    XML_BLOCK_INVALID_SIZE,

    /**
     * 
     *                         An XML block in sealed content is empty. 
     *                     
     * 
     */
    XML_BLOCK_EMPTY,

    /**
     * 
     *                         An XML block in sealed content is truncated or missing. 
     *                     
     * 
     */
    XML_BLOCK_TRUNCATED,

    /**
     * 
     *                         The sealed content preamble was not found. This error code indicates that the content is probably not a sealed.
     *                     
     * 
     */
    PREAMBLE_NOT_FOUND,

    /**
     * 
     *                         The sealed content magic value was not found. This error code indicates that the content is probably corrupt or not sealed.
     *                     
     * 
     */
    MAGIC_NOT_FOUND,

    /**
     * 
     *                         The public header is not present in the sealed content. This error code indicates that a valid XML document was found where the public header should be, but the XML document was not a public header. This error indicates that the XML has been modified.
     *                     
     * 
     */
    PUBLIC_HEADER_MISSING,

    /**
     * 
     *                         The public header XML is badly formed. This error code indicates that the public header XML cannot be parsed. This error indicates that the XML has been corrupted.
     *                     
     * 
     */
    PUBLIC_HEADER_CORRUPT,

    /**
     * 
     *                         The public header has failed signature verification. This error code indicates that the public header XML has a valid structure but the contents have been modified.
     *                     
     * 
     */
    PUBLIC_HEADER_SIGNATURE_MISMATCH,

    /**
     * 
     *                         The public header signatures are not present in the sealed content. This error code indicates that a valid XML document was found where the public header signatures should be, but the XML document was not a public header signature. This error indicates that the XML has been modified.
     *                     
     * 
     */
    PUBLIC_HEADER_SIGNATURE_MISSING,

    /**
     * 
     *                         The public header signatures XML is badly formed. This error code indicates that the public header signatures XML cannot be parsed. This error indicates that the XML has been corrupted.
     *                     
     * 
     */
    PUBLIC_HEADER_SIGNATURE_CORRUPT,

    /**
     * 
     *                         A private header does not match the public header. This error code indicates that the content has probably been corrupted.
     *                     
     * 
     */
    PUBLIC_HEADER_DATA_DIGEST_MISMATCH,

    /**
     * 
     *                         The encrypted data has been modified. The contents of a block appear to have been corrupted. This error code indicates that the content has probably been corrupted.
     *                     
     * 
     */
    PRIVATE_BLOCK_DIGEST_MISMATCH,

    /**
     * 
     *                         The contents of a sealed content private header are invalid. This error code indicates that the content has probably been corrupted.
     *                     
     * 
     */
    PRIVATE_HEADER_CORRUPT;

    public String value() {
        return name();
    }

    public static ContentParseFaultReason fromValue(String v) {
        return valueOf(v);
    }

}
