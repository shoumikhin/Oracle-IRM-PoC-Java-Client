
package com.oracle.xmlns.irm.core;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.irm.core package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.irm.core
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AbsoluteTimeSpan }
     * 
     */
    public AbsoluteTimeSpan createAbsoluteTimeSpan() {
        return new AbsoluteTimeSpan();
    }

    /**
     * Create an instance of {@link RelativeTimeSpan }
     * 
     */
    public RelativeTimeSpan createRelativeTimeSpan() {
        return new RelativeTimeSpan();
    }

    /**
     * Create an instance of {@link TimePeriod }
     * 
     */
    public TimePeriod createTimePeriod() {
        return new TimePeriod();
    }

    /**
     * Create an instance of {@link LicenseCriteria }
     * 
     */
    public LicenseCriteria createLicenseCriteria() {
        return new LicenseCriteria();
    }

    /**
     * Create an instance of {@link Feature }
     * 
     */
    public Feature createFeature() {
        return new Feature();
    }

    /**
     * Create an instance of {@link ClassificationSystem }
     * 
     */
    public ClassificationSystem createClassificationSystem() {
        return new ClassificationSystem();
    }

    /**
     * Create an instance of {@link XPathExpression }
     * 
     */
    public XPathExpression createXPathExpression() {
        return new XPathExpression();
    }

    /**
     * Create an instance of {@link XPathClassificationFilter }
     * 
     */
    public XPathClassificationFilter createXPathClassificationFilter() {
        return new XPathClassificationFilter();
    }

    /**
     * Create an instance of {@link Label }
     * 
     */
    public Label createLabel() {
        return new Label();
    }

    /**
     * Create an instance of {@link ClassificationSystemRef }
     * 
     */
    public ClassificationSystemRef createClassificationSystemRef() {
        return new ClassificationSystemRef();
    }

}
