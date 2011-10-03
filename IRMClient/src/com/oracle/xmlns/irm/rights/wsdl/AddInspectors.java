
package com.oracle.xmlns.irm.rights.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.irm.core.AccountRef;
import com.oracle.xmlns.irm.rights.DomainRef;


/**
 * 
 *                             Add one or inspectors to a domain. A domain can have zero of more inspectors.
 *                         
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="domain" type="{http://xmlns.oracle.com/irm/rights}DomainRef"/>
 *         &lt;element name="accounts" type="{http://xmlns.oracle.com/irm/core}AccountRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "domain",
    "accounts"
})
@XmlRootElement(name = "AddInspectors")
public class AddInspectors {

    @XmlElement(required = true)
    protected DomainRef domain;
    protected List<AccountRef> accounts;

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link DomainRef }
     *     
     */
    public DomainRef getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainRef }
     *     
     */
    public void setDomain(DomainRef value) {
        this.domain = value;
    }

    /**
     * Gets the value of the accounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountRef }
     * 
     * 
     */
    public List<AccountRef> getAccounts() {
        if (accounts == null) {
            accounts = new ArrayList<AccountRef>();
        }
        return this.accounts;
    }

}
