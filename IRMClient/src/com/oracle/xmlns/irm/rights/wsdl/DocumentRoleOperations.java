
package com.oracle.xmlns.irm.rights.wsdl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.oracle.xmlns.irm.rights.ContextInstanceRef;
import com.oracle.xmlns.irm.rights.DocumentRole;
import com.oracle.xmlns.irm.rights.DocumentRoleRef;
import com.oracle.xmlns.irm.rights.DomainRef;


/**
 * 
 *             Document role operations. The document role operations include role management operations such as creating, editing and copying roles. The document role operations also include role assignment roles and re-assignment.
 *         
 * 
 * This class was generated by the JAX-WS RI.
 * Oracle JAX-WS 2.1.5
 * Generated source version: 2.1
 * 
 */
@WebService(name = "DocumentRoleOperations", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl")
@XmlSeeAlso({
    com.oracle.xmlns.irm.classifications.ObjectFactory.class,
    com.oracle.xmlns.irm.core.ObjectFactory.class,
    com.oracle.xmlns.irm.rights.ObjectFactory.class,
    com.oracle.xmlns.irm.rights.wsdl.ObjectFactory.class,
    com.oracle.xmlns.irm.system.ObjectFactory.class
})
public interface DocumentRoleOperations {


    /**
     * 
     *                 List document roles owned by a domain. Document roles are owned by a Domain. Roles are created using Save New Role and the domain that owns the role must be provided at this time.
     *             
     * 
     * @param domain
     * @return
     *     returns java.util.List<com.oracle.xmlns.irm.rights.DocumentRole>
     * @throws UnknownDomainFault
     * @throws AuthorizationDeniedFault
     */
    @WebMethod(operationName = "ListRoles", action = "urn:DocumentRoleOperations#ListRoles")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListRoles", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.ListRoles")
    @ResponseWrapper(localName = "ListRolesResponse", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.ListRolesResponse")
    public List<DocumentRole> listRoles(
        @WebParam(name = "domain", targetNamespace = "")
        DomainRef domain)
        throws AuthorizationDeniedFault, UnknownDomainFault
    ;

    /**
     * 
     *                 List document roles available to a context. The set of roles available to a context are based on the roles of associated template. Changes in the template's roles affect which roles are available to the context.
     *             
     * 
     * @param context
     * @return
     *     returns java.util.List<com.oracle.xmlns.irm.rights.DocumentRole>
     * @throws UnknownContextFault
     * @throws AuthorizationDeniedFault
     */
    @WebMethod(operationName = "ListRolesForContext", action = "urn:DocumentRoleOperations#ListRolesForContext")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListRolesForContext", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.ListRolesForContext")
    @ResponseWrapper(localName = "ListRolesForContextResponse", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.ListRolesForContextResponse")
    public List<DocumentRole> listRolesForContext(
        @WebParam(name = "context", targetNamespace = "")
        ContextInstanceRef context)
        throws AuthorizationDeniedFault, UnknownContextFault
    ;

    /**
     * 
     *                 Save a new document role. The document role will be owned by the specified Domain.
     *             
     * 
     * @param domain
     * @param role
     * @return
     *     returns com.oracle.xmlns.irm.rights.DocumentRole
     * @throws DocumentRoleAlreadyExistsFault
     * @throws InvalidTimePeriodFault
     * @throws UnknownDomainFault
     * @throws AuthorizationDeniedFault
     * @throws InvalidFeaturesFault
     */
    @WebMethod(operationName = "SaveNewRole", action = "urn:DocumentRoleOperations#SaveNewRole")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SaveNewRole", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.SaveNewRole")
    @ResponseWrapper(localName = "SaveNewRoleResponse", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.SaveNewRoleResponse")
    public DocumentRole saveNewRole(
        @WebParam(name = "domain", targetNamespace = "")
        DomainRef domain,
        @WebParam(name = "role", targetNamespace = "")
        DocumentRole role)
        throws AuthorizationDeniedFault, DocumentRoleAlreadyExistsFault, InvalidFeaturesFault, InvalidTimePeriodFault, UnknownDomainFault
    ;

    /**
     * 
     *                 Save changes to a document role. Save changes to a Document Role by providing two copies. Changes are made by comparing the two copies of the role. If there are no differences in a property then no changes are made to persistent storage for that property. Changes in collection based properties cause additions or removals to occur in persistent storage. For example, if the delta contains a new Feature as compared to the role then a new role will be associated with the template.
     *             
     * 
     * @param delta
     * @param role
     * @return
     *     returns com.oracle.xmlns.irm.rights.DocumentRole
     * @throws ImmutableDocumentRoleFault
     * @throws InvalidTimePeriodFault
     * @throws UnknownDocumentRoleFault
     * @throws AuthorizationDeniedFault
     * @throws InvalidFeaturesFault
     */
    @WebMethod(operationName = "SaveChangesToRole", action = "urn:DocumentRoleOperations#SaveChangesToRole")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SaveChangesToRole", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.SaveChangesToRole")
    @ResponseWrapper(localName = "SaveChangesToRoleResponse", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.SaveChangesToRoleResponse")
    public DocumentRole saveChangesToRole(
        @WebParam(name = "role", targetNamespace = "")
        DocumentRole role,
        @WebParam(name = "delta", targetNamespace = "")
        DocumentRole delta)
        throws AuthorizationDeniedFault, ImmutableDocumentRoleFault, InvalidFeaturesFault, InvalidTimePeriodFault, UnknownDocumentRoleFault
    ;

    /**
     * 
     *                 Delete a set of roles. Deleting a role also automatically unassigns the rights assigned against this role. This method silently ignores roles that do not exist.
     *             
     * 
     * @param roles
     * @throws CannotRemoveDocumentRoleFault
     * @throws AuthorizationDeniedFault
     */
    @WebMethod(operationName = "DeleteRoles", action = "urn:DocumentRoleOperations#DeleteRoles")
    @RequestWrapper(localName = "DeleteRoles", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.DeleteRoles")
    @ResponseWrapper(localName = "DeleteRolesResponse", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.DeleteRolesResponse")
    public void deleteRoles(
        @WebParam(name = "roles", targetNamespace = "")
        List<DocumentRoleRef> roles)
        throws AuthorizationDeniedFault, CannotRemoveDocumentRoleFault
    ;

    /**
     * 
     *                 Copy a set of roles. Copy a set of document roles to another Domain. When roles are copied the rights assigned to those roles are not copied. Labels are also copied and altered to reflect that the result is a copy of the role. For example, in English, the role Contributor would turn into Copy Of Contributor.
     *             
     * 
     * @param roles
     * @param domain
     * @return
     *     returns java.util.List<com.oracle.xmlns.irm.rights.DocumentRole>
     * @throws UnknownDocumentRoleFault
     * @throws UnknownDomainFault
     * @throws AuthorizationDeniedFault
     */
    @WebMethod(operationName = "CopyRoles", action = "urn:DocumentRoleOperations#CopyRoles")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CopyRoles", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.CopyRoles")
    @ResponseWrapper(localName = "CopyRolesResponse", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.CopyRolesResponse")
    public List<DocumentRole> copyRoles(
        @WebParam(name = "roles", targetNamespace = "")
        List<DocumentRoleRef> roles,
        @WebParam(name = "domain", targetNamespace = "")
        DomainRef domain)
        throws AuthorizationDeniedFault, UnknownDocumentRoleFault, UnknownDomainFault
    ;

}
