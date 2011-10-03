
package com.oracle.xmlns.irm.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.irm.core.DesktopKeySetExtensions;


/**
 * 
 *                         Key set extensions. Key set extensions allow additional information to be attached to a Key Set. This information might be encrypted key values or raw key values. These extensions can be different depending on the use of the key set, or how the key set was obtained.
 *                     
 * 
 * <p>Java class for KeySetExtensions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeySetExtensions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeySetExtensions")
@XmlSeeAlso({
    DesktopKeySetExtensions.class,
    WrappedKeySetExtensions.class,
    RawKeySetExtensions.class
})
public abstract class KeySetExtensions {


}
