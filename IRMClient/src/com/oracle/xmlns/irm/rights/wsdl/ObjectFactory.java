
package com.oracle.xmlns.irm.rights.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.oracle.xmlns.irm.classifications.UnknownContextFault;
import com.oracle.xmlns.irm.rights.CannotRemoveDocumentRoleFault;
import com.oracle.xmlns.irm.rights.DocumentRoleAlreadyExistsFault;
import com.oracle.xmlns.irm.rights.ImmutableDocumentRoleFault;
import com.oracle.xmlns.irm.rights.InvalidFeaturesFault;
import com.oracle.xmlns.irm.rights.InvalidTimePeriodFault;
import com.oracle.xmlns.irm.rights.UnknownDocumentRoleFault;
import com.oracle.xmlns.irm.rights.UnknownDomainFault;
import com.oracle.xmlns.irm.system.AuthorizationDeniedFault;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.irm.rights.wsdl package. 
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

    private final static QName _UnknownDocumentRoleFault_QNAME = new QName("http://xmlns.oracle.com/irm/rights/wsdl", "UnknownDocumentRoleFault");
    private final static QName _UnknownDomainFault_QNAME = new QName("http://xmlns.oracle.com/irm/rights/wsdl", "UnknownDomainFault");
    private final static QName _UnknownContextFault_QNAME = new QName("http://xmlns.oracle.com/irm/rights/wsdl", "UnknownContextFault");
    private final static QName _ImmutableDocumentRoleFault_QNAME = new QName("http://xmlns.oracle.com/irm/rights/wsdl", "ImmutableDocumentRoleFault");
    private final static QName _CannotRemoveDocumentRoleFault_QNAME = new QName("http://xmlns.oracle.com/irm/rights/wsdl", "CannotRemoveDocumentRoleFault");
    private final static QName _DocumentRoleAlreadyExistsFault_QNAME = new QName("http://xmlns.oracle.com/irm/rights/wsdl", "DocumentRoleAlreadyExistsFault");
    private final static QName _AuthorizationDeniedFault_QNAME = new QName("http://xmlns.oracle.com/irm/rights/wsdl", "AuthorizationDeniedFault");
    private final static QName _InvalidFeaturesFault_QNAME = new QName("http://xmlns.oracle.com/irm/rights/wsdl", "InvalidFeaturesFault");
    private final static QName _InvalidTimePeriodFault_QNAME = new QName("http://xmlns.oracle.com/irm/rights/wsdl", "InvalidTimePeriodFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.irm.rights.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListRolesForContextResponse }
     * 
     */
    public ListRolesForContextResponse createListRolesForContextResponse() {
        return new ListRolesForContextResponse();
    }

    /**
     * Create an instance of {@link SaveChangesToRoleResponse }
     * 
     */
    public SaveChangesToRoleResponse createSaveChangesToRoleResponse() {
        return new SaveChangesToRoleResponse();
    }

    /**
     * Create an instance of {@link CopyRoles }
     * 
     */
    public CopyRoles createCopyRoles() {
        return new CopyRoles();
    }

    /**
     * Create an instance of {@link ListRolesForContext }
     * 
     */
    public ListRolesForContext createListRolesForContext() {
        return new ListRolesForContext();
    }

    /**
     * Create an instance of {@link SaveNewRole }
     * 
     */
    public SaveNewRole createSaveNewRole() {
        return new SaveNewRole();
    }

    /**
     * Create an instance of {@link DeleteRoles }
     * 
     */
    public DeleteRoles createDeleteRoles() {
        return new DeleteRoles();
    }

    /**
     * Create an instance of {@link SaveNewRoleResponse }
     * 
     */
    public SaveNewRoleResponse createSaveNewRoleResponse() {
        return new SaveNewRoleResponse();
    }

    /**
     * Create an instance of {@link ListRolesResponse }
     * 
     */
    public ListRolesResponse createListRolesResponse() {
        return new ListRolesResponse();
    }

    /**
     * Create an instance of {@link SaveChangesToRole }
     * 
     */
    public SaveChangesToRole createSaveChangesToRole() {
        return new SaveChangesToRole();
    }

    /**
     * Create an instance of {@link ListRoles }
     * 
     */
    public ListRoles createListRoles() {
        return new ListRoles();
    }

    /**
     * Create an instance of {@link CopyRolesResponse }
     * 
     */
    public CopyRolesResponse createCopyRolesResponse() {
        return new CopyRolesResponse();
    }

    /**
     * Create an instance of {@link DeleteRolesResponse }
     * 
     */
    public DeleteRolesResponse createDeleteRolesResponse() {
        return new DeleteRolesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownDocumentRoleFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/irm/rights/wsdl", name = "UnknownDocumentRoleFault")
    public JAXBElement<UnknownDocumentRoleFault> createUnknownDocumentRoleFault(UnknownDocumentRoleFault value) {
        return new JAXBElement<UnknownDocumentRoleFault>(_UnknownDocumentRoleFault_QNAME, UnknownDocumentRoleFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownDomainFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/irm/rights/wsdl", name = "UnknownDomainFault")
    public JAXBElement<UnknownDomainFault> createUnknownDomainFault(UnknownDomainFault value) {
        return new JAXBElement<UnknownDomainFault>(_UnknownDomainFault_QNAME, UnknownDomainFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownContextFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/irm/rights/wsdl", name = "UnknownContextFault")
    public JAXBElement<UnknownContextFault> createUnknownContextFault(UnknownContextFault value) {
        return new JAXBElement<UnknownContextFault>(_UnknownContextFault_QNAME, UnknownContextFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImmutableDocumentRoleFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/irm/rights/wsdl", name = "ImmutableDocumentRoleFault")
    public JAXBElement<ImmutableDocumentRoleFault> createImmutableDocumentRoleFault(ImmutableDocumentRoleFault value) {
        return new JAXBElement<ImmutableDocumentRoleFault>(_ImmutableDocumentRoleFault_QNAME, ImmutableDocumentRoleFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CannotRemoveDocumentRoleFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/irm/rights/wsdl", name = "CannotRemoveDocumentRoleFault")
    public JAXBElement<CannotRemoveDocumentRoleFault> createCannotRemoveDocumentRoleFault(CannotRemoveDocumentRoleFault value) {
        return new JAXBElement<CannotRemoveDocumentRoleFault>(_CannotRemoveDocumentRoleFault_QNAME, CannotRemoveDocumentRoleFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentRoleAlreadyExistsFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/irm/rights/wsdl", name = "DocumentRoleAlreadyExistsFault")
    public JAXBElement<DocumentRoleAlreadyExistsFault> createDocumentRoleAlreadyExistsFault(DocumentRoleAlreadyExistsFault value) {
        return new JAXBElement<DocumentRoleAlreadyExistsFault>(_DocumentRoleAlreadyExistsFault_QNAME, DocumentRoleAlreadyExistsFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizationDeniedFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/irm/rights/wsdl", name = "AuthorizationDeniedFault")
    public JAXBElement<AuthorizationDeniedFault> createAuthorizationDeniedFault(AuthorizationDeniedFault value) {
        return new JAXBElement<AuthorizationDeniedFault>(_AuthorizationDeniedFault_QNAME, AuthorizationDeniedFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidFeaturesFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/irm/rights/wsdl", name = "InvalidFeaturesFault")
    public JAXBElement<InvalidFeaturesFault> createInvalidFeaturesFault(InvalidFeaturesFault value) {
        return new JAXBElement<InvalidFeaturesFault>(_InvalidFeaturesFault_QNAME, InvalidFeaturesFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidTimePeriodFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/irm/rights/wsdl", name = "InvalidTimePeriodFault")
    public JAXBElement<InvalidTimePeriodFault> createInvalidTimePeriodFault(InvalidTimePeriodFault value) {
        return new JAXBElement<InvalidTimePeriodFault>(_InvalidTimePeriodFault_QNAME, InvalidTimePeriodFault.class, null, value);
    }

}
