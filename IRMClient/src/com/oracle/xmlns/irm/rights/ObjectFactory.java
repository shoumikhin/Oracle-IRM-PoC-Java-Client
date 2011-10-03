
package com.oracle.xmlns.irm.rights;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.irm.rights package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.irm.rights
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DocumentRoleRef }
     * 
     */
    public DocumentRoleRef createDocumentRoleRef() {
        return new DocumentRoleRef();
    }

    /**
     * Create an instance of {@link Domain }
     * 
     */
    public Domain createDomain() {
        return new Domain();
    }

    /**
     * Create an instance of {@link DocumentRoleAlreadyExistsFault }
     * 
     */
    public DocumentRoleAlreadyExistsFault createDocumentRoleAlreadyExistsFault() {
        return new DocumentRoleAlreadyExistsFault();
    }

    /**
     * Create an instance of {@link CannotRemoveDocumentRoleFault }
     * 
     */
    public CannotRemoveDocumentRoleFault createCannotRemoveDocumentRoleFault() {
        return new CannotRemoveDocumentRoleFault();
    }

    /**
     * Create an instance of {@link DomainRef }
     * 
     */
    public DomainRef createDomainRef() {
        return new DomainRef();
    }

    /**
     * Create an instance of {@link ContextTemplate }
     * 
     */
    public ContextTemplate createContextTemplate() {
        return new ContextTemplate();
    }

    /**
     * Create an instance of {@link ContextInstance }
     * 
     */
    public ContextInstance createContextInstance() {
        return new ContextInstance();
    }

    /**
     * Create an instance of {@link DocumentRole }
     * 
     */
    public DocumentRole createDocumentRole() {
        return new DocumentRole();
    }

    /**
     * Create an instance of {@link ImmutableDocumentRoleFault }
     * 
     */
    public ImmutableDocumentRoleFault createImmutableDocumentRoleFault() {
        return new ImmutableDocumentRoleFault();
    }

    /**
     * Create an instance of {@link ContextTemplateRef }
     * 
     */
    public ContextTemplateRef createContextTemplateRef() {
        return new ContextTemplateRef();
    }

    /**
     * Create an instance of {@link InvalidTimePeriodFault }
     * 
     */
    public InvalidTimePeriodFault createInvalidTimePeriodFault() {
        return new InvalidTimePeriodFault();
    }

    /**
     * Create an instance of {@link InvalidFeaturesFault }
     * 
     */
    public InvalidFeaturesFault createInvalidFeaturesFault() {
        return new InvalidFeaturesFault();
    }

    /**
     * Create an instance of {@link ContextInstanceRef }
     * 
     */
    public ContextInstanceRef createContextInstanceRef() {
        return new ContextInstanceRef();
    }

    /**
     * Create an instance of {@link UnknownDomainFault }
     * 
     */
    public UnknownDomainFault createUnknownDomainFault() {
        return new UnknownDomainFault();
    }

    /**
     * Create an instance of {@link UnknownDocumentRoleFault }
     * 
     */
    public UnknownDocumentRoleFault createUnknownDocumentRoleFault() {
        return new UnknownDocumentRoleFault();
    }

}
