
package com.oracle.xmlns.irm.classifications;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.irm.classifications package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.irm.classifications
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ItemCode }
     * 
     */
    public ItemCode createItemCode() {
        return new ItemCode();
    }

    /**
     * Create an instance of {@link ContextRef }
     * 
     */
    public ContextRef createContextRef() {
        return new ContextRef();
    }

    /**
     * Create an instance of {@link ItemConstraints }
     * 
     */
    public ItemConstraints createItemConstraints() {
        return new ItemConstraints();
    }

    /**
     * Create an instance of {@link UnknownContextFault }
     * 
     */
    public UnknownContextFault createUnknownContextFault() {
        return new UnknownContextFault();
    }

    /**
     * Create an instance of {@link Context }
     * 
     */
    public Context createContext() {
        return new Context();
    }

}
