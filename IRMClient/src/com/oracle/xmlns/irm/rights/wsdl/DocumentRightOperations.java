
package com.oracle.xmlns.irm.rights.wsdl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.oracle.xmlns.irm.classifications.ItemCode;
import com.oracle.xmlns.irm.core.AccountRef;
import com.oracle.xmlns.irm.core.PageRange;
import com.oracle.xmlns.irm.rights.ContextInstanceRef;
import com.oracle.xmlns.irm.rights.DocumentRight;
import com.oracle.xmlns.irm.rights.DocumentRightRef;
import com.oracle.xmlns.irm.rights.DocumentRoleRef;


/**
 * 
 *             Document right operations. Document right operations include checking in rights, altering item restrictions, listing rights and checking items across sets of rights.
 *         
 * 
 * This class was generated by the JAX-WS RI.
 * Oracle JAX-WS 2.1.5
 * Generated source version: 2.1
 * 
 */
@WebService(name = "DocumentRightOperations", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl")
@XmlSeeAlso({
    com.oracle.xmlns.irm.classifications.ObjectFactory.class,
    com.oracle.xmlns.irm.core.ObjectFactory.class,
    com.oracle.xmlns.irm.rights.ObjectFactory.class,
    com.oracle.xmlns.irm.rights.wsdl.ObjectFactory.class,
    com.oracle.xmlns.irm.system.ObjectFactory.class
})
public interface DocumentRightOperations {


    /**
     * 
     *                 Assign a document role. A document role can be assigned, within a context, to one or more accounts. An account can only have one role assigned within a Context. If any of the provided accounts already has the role assigned the account is silently ignored and the role is not re-assigned.
     *             
     * 
     * @param accounts
     * @param items
     * @param context
     * @param role
     * @return
     *     returns java.util.List<com.oracle.xmlns.irm.rights.DocumentRight>
     * @throws UnknownDocumentRoleFault
     * @throws AuthorizationDeniedFault
     * @throws UnknownContextFault
     * @throws AccountAlreadyAssignedFault
     * @throws UnsupportedDocumentRoleFault
     */
    @WebMethod(operationName = "AssignRole", action = "urn:DocumentRightOperations#AssignRole")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AssignRole", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.AssignRole")
    @ResponseWrapper(localName = "AssignRoleResponse", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.AssignRoleResponse")
    public List<DocumentRight> assignRole(
        @WebParam(name = "context", targetNamespace = "")
        ContextInstanceRef context,
        @WebParam(name = "role", targetNamespace = "")
        DocumentRoleRef role,
        @WebParam(name = "accounts", targetNamespace = "")
        List<AccountRef> accounts,
        @WebParam(name = "items", targetNamespace = "")
        List<ItemCode> items)
        throws AccountAlreadyAssignedFault, AuthorizationDeniedFault, UnknownContextFault, UnknownDocumentRoleFault, UnsupportedDocumentRoleFault
    ;

    /**
     * 
     *                 Alter role assignments. Change the role assigned to an account. This also resets any item restrictions placed on the assigned right. As an account can only have one role assigned within a Context this method can be used to alter the role assignment without a two-step unassign right and assign role.
     *             
     * 
     * @param items
     * @param rights
     * @param role
     * @return
     *     returns java.util.List<com.oracle.xmlns.irm.rights.DocumentRight>
     * @throws UnknownDocumentRightFault
     * @throws UnknownDocumentRoleFault
     * @throws AuthorizationDeniedFault
     * @throws UnsupportedDocumentRoleFault
     */
    @WebMethod(operationName = "ReassignRole", action = "urn:DocumentRightOperations#ReassignRole")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ReassignRole", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.ReassignRole")
    @ResponseWrapper(localName = "ReassignRoleResponse", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.ReassignRoleResponse")
    public List<DocumentRight> reassignRole(
        @WebParam(name = "rights", targetNamespace = "")
        List<DocumentRightRef> rights,
        @WebParam(name = "role", targetNamespace = "")
        DocumentRoleRef role,
        @WebParam(name = "items", targetNamespace = "")
        List<ItemCode> items)
        throws AuthorizationDeniedFault, UnknownDocumentRightFault, UnknownDocumentRoleFault, UnsupportedDocumentRoleFault
    ;

    /**
     * 
     *                 Check all rights in use by an account. If a user's device fails, or has issues with desktop installations, the rights that are in use can be force-ably checked in. This allows the account to request the rights on another device. If the account does not exist an empty collection is returned. The checked-in rights are restricted to the contexts that the caller is a context manager.
     *             
     * 
     * @param account
     * @return
     *     returns java.util.List<com.oracle.xmlns.irm.rights.DocumentRight>
     * @throws AuthorizationDeniedFault
     */
    @WebMethod(operationName = "CheckInRightsForAccount", action = "urn:DocumentRightOperations#CheckInRightsForAccount")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CheckInRightsForAccount", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.CheckInRightsForAccount")
    @ResponseWrapper(localName = "CheckInRightsForAccountResponse", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.CheckInRightsForAccountResponse")
    public List<DocumentRight> checkInRightsForAccount(
        @WebParam(name = "account", targetNamespace = "")
        AccountRef account)
        throws AuthorizationDeniedFault
    ;

    /**
     * 
     *                 Alter the item restrictions for a set of rights. Alter the item restrictions on one or more Document Right. Changes are made to the list of item restrictions by comparing the two copies of the item codes provided and either removing or adding item restrictions by looking at the delta. For example if the delta (as compared to the first list of items) contains additional Item Code instances then new items will be added to the rights. However, if the delta (as compared to the first list of items) does not contain an Item Code instance then the items will be removed from the rights.
     *             
     * 
     * @param itemCodes
     * @param delta
     * @param rights
     * @return
     *     returns java.util.List<com.oracle.xmlns.irm.rights.DocumentRight>
     * @throws UnknownDocumentRightFault
     * @throws AuthorizationDeniedFault
     */
    @WebMethod(operationName = "SaveChangesToItems", action = "urn:DocumentRightOperations#SaveChangesToItems")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SaveChangesToItems", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.SaveChangesToItems")
    @ResponseWrapper(localName = "SaveChangesToItemsResponse", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.SaveChangesToItemsResponse")
    public List<DocumentRight> saveChangesToItems(
        @WebParam(name = "rights", targetNamespace = "")
        List<DocumentRightRef> rights,
        @WebParam(name = "itemCodes", targetNamespace = "")
        List<ItemCode> itemCodes,
        @WebParam(name = "delta", targetNamespace = "")
        List<ItemCode> delta)
        throws AuthorizationDeniedFault, UnknownDocumentRightFault
    ;

    /**
     * 
     *                 Un-assign a set of rights. If the right has already been unassigned this method will not report an error.
     *             
     * 
     * @param rights
     * @throws AuthorizationDeniedFault
     */
    @WebMethod(operationName = "UnassignRights", action = "urn:DocumentRightOperations#UnassignRights")
    @RequestWrapper(localName = "UnassignRights", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.UnassignRights")
    @ResponseWrapper(localName = "UnassignRightsResponse", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.UnassignRightsResponse")
    public void unassignRights(
        @WebParam(name = "rights", targetNamespace = "")
        List<DocumentRightRef> rights)
        throws AuthorizationDeniedFault
    ;

    /**
     * 
     *                 List rights assigned within a context. This method lists rights assigned within a context, ordered by the date the role was assigned (most recent rights first). If large numbers of rights are assigned the page range parameter can be used to retrieve the rights in smaller chunks.
     *             
     * 
     * @param pageRange
     * @param context
     * @return
     *     returns java.util.List<com.oracle.xmlns.irm.rights.DocumentRight>
     * @throws AuthorizationDeniedFault
     * @throws UnknownContextFault
     */
    @WebMethod(operationName = "ListRightsByContext", action = "urn:DocumentRightOperations#ListRightsByContext")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListRightsByContext", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.ListRightsByContext")
    @ResponseWrapper(localName = "ListRightsByContextResponse", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.ListRightsByContextResponse")
    public List<DocumentRight> listRightsByContext(
        @WebParam(name = "context", targetNamespace = "")
        ContextInstanceRef context,
        @WebParam(name = "pageRange", targetNamespace = "")
        PageRange pageRange)
        throws AuthorizationDeniedFault, UnknownContextFault
    ;

    /**
     * 
     *                 List rights for an account. Rights listed for an account include rights obtained indirectly through group membership. If the account does not exist an empty collection is returned. Only rights that the caller is allowed to view will be returned. The caller can view rights if they are a context manager or inspector (for the related context).
     *             
     * 
     * @param account
     * @return
     *     returns java.util.List<com.oracle.xmlns.irm.rights.DocumentRight>
     * @throws AuthorizationDeniedFault
     */
    @WebMethod(operationName = "ListRightsByAccount", action = "urn:DocumentRightOperations#ListRightsByAccount")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListRightsByAccount", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.ListRightsByAccount")
    @ResponseWrapper(localName = "ListRightsByAccountResponse", targetNamespace = "http://xmlns.oracle.com/irm/rights/wsdl", className = "com.oracle.xmlns.irm.rights.wsdl.ListRightsByAccountResponse")
    public List<DocumentRight> listRightsByAccount(
        @WebParam(name = "account", targetNamespace = "")
        AccountRef account)
        throws AuthorizationDeniedFault
    ;

}
