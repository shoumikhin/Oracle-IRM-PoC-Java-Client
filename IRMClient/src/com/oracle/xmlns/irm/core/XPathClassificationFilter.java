
package com.oracle.xmlns.irm.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         An XPath based classification filter. An XPath classification filter uses a boolean XPath expression to filter out applicable classifications. The classification Cookie is transformed into an XML document and then compared against the boolean XPath expression. This can be used as a generic way of filtering out Classification instances by running an expression against the XML based cookie. For example, the context classification system uses an XPath that matches on the Context UUID. e.g. the following XPath expression would match all sealed content that had a context cookie with a context UUID of 37bbe0fa-9eb4-462e-85b6-9796610f1b20. context:ContextCookie/context[uuid='37bbe0fa-9eb4-462e-85b6-9796610f1b20'].
 *                     
 * 
 * <p>Java class for XPathClassificationFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XPathClassificationFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/irm/core}ClassificationFilter">
 *       &lt;sequence>
 *         &lt;element name="expression" type="{http://xmlns.oracle.com/irm/core}XPathExpression"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XPathClassificationFilter", propOrder = {
    "expression"
})
public class XPathClassificationFilter
    extends ClassificationFilter
{

    @XmlElement(required = true)
    protected XPathExpression expression;

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link XPathExpression }
     *     
     */
    public XPathExpression getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPathExpression }
     *     
     */
    public void setExpression(XPathExpression value) {
        this.expression = value;
    }

}
