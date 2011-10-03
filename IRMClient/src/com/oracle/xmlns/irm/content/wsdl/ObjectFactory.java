
package com.oracle.xmlns.irm.content.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.oracle.xmlns.irm.content.ContentParseFault;
import com.oracle.xmlns.irm.content.IllegalEncryptedContentBlockSizeFault;
import com.oracle.xmlns.irm.content.PublicHeaderLengthFault;
import com.oracle.xmlns.irm.content.UnsupportedContentTypeFault;
import com.oracle.xmlns.irm.system.AuthorizationDeniedFault;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.irm.content.wsdl package. 
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

    private final static QName _IllegalEncryptedContentBlockSizeFault_QNAME = new QName("http://xmlns.oracle.com/irm/content/wsdl", "IllegalEncryptedContentBlockSizeFault");
    private final static QName _AuthorizationDeniedFault_QNAME = new QName("http://xmlns.oracle.com/irm/content/wsdl", "AuthorizationDeniedFault");
    private final static QName _ContentParseFault_QNAME = new QName("http://xmlns.oracle.com/irm/content/wsdl", "ContentParseFault");
    private final static QName _UnsupportedContentTypeFault_QNAME = new QName("http://xmlns.oracle.com/irm/content/wsdl", "UnsupportedContentTypeFault");
    private final static QName _PublicHeaderLengthFault_QNAME = new QName("http://xmlns.oracle.com/irm/content/wsdl", "PublicHeaderLengthFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.irm.content.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidatedPeekResponse }
     * 
     */
    public ValidatedPeekResponse createValidatedPeekResponse() {
        return new ValidatedPeekResponse();
    }

    /**
     * Create an instance of {@link Reclassify }
     * 
     */
    public Reclassify createReclassify() {
        return new Reclassify();
    }

    /**
     * Create an instance of {@link SealResponse }
     * 
     */
    public SealResponse createSealResponse() {
        return new SealResponse();
    }

    /**
     * Create an instance of {@link ValidatedPeek }
     * 
     */
    public ValidatedPeek createValidatedPeek() {
        return new ValidatedPeek();
    }

    /**
     * Create an instance of {@link Reseal }
     * 
     */
    public Reseal createReseal() {
        return new Reseal();
    }

    /**
     * Create an instance of {@link Seal }
     * 
     */
    public Seal createSeal() {
        return new Seal();
    }

    /**
     * Create an instance of {@link UnsealResponse }
     * 
     */
    public UnsealResponse createUnsealResponse() {
        return new UnsealResponse();
    }

    /**
     * Create an instance of {@link ResealResponse }
     * 
     */
    public ResealResponse createResealResponse() {
        return new ResealResponse();
    }

    /**
     * Create an instance of {@link Unseal }
     * 
     */
    public Unseal createUnseal() {
        return new Unseal();
    }

    /**
     * Create an instance of {@link Peek }
     * 
     */
    public Peek createPeek() {
        return new Peek();
    }

    /**
     * Create an instance of {@link ReclassifyResponse }
     * 
     */
    public ReclassifyResponse createReclassifyResponse() {
        return new ReclassifyResponse();
    }

    /**
     * Create an instance of {@link PeekResponse }
     * 
     */
    public PeekResponse createPeekResponse() {
        return new PeekResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IllegalEncryptedContentBlockSizeFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/irm/content/wsdl", name = "IllegalEncryptedContentBlockSizeFault")
    public JAXBElement<IllegalEncryptedContentBlockSizeFault> createIllegalEncryptedContentBlockSizeFault(IllegalEncryptedContentBlockSizeFault value) {
        return new JAXBElement<IllegalEncryptedContentBlockSizeFault>(_IllegalEncryptedContentBlockSizeFault_QNAME, IllegalEncryptedContentBlockSizeFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizationDeniedFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/irm/content/wsdl", name = "AuthorizationDeniedFault")
    public JAXBElement<AuthorizationDeniedFault> createAuthorizationDeniedFault(AuthorizationDeniedFault value) {
        return new JAXBElement<AuthorizationDeniedFault>(_AuthorizationDeniedFault_QNAME, AuthorizationDeniedFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentParseFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/irm/content/wsdl", name = "ContentParseFault")
    public JAXBElement<ContentParseFault> createContentParseFault(ContentParseFault value) {
        return new JAXBElement<ContentParseFault>(_ContentParseFault_QNAME, ContentParseFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsupportedContentTypeFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/irm/content/wsdl", name = "UnsupportedContentTypeFault")
    public JAXBElement<UnsupportedContentTypeFault> createUnsupportedContentTypeFault(UnsupportedContentTypeFault value) {
        return new JAXBElement<UnsupportedContentTypeFault>(_UnsupportedContentTypeFault_QNAME, UnsupportedContentTypeFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublicHeaderLengthFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/irm/content/wsdl", name = "PublicHeaderLengthFault")
    public JAXBElement<PublicHeaderLengthFault> createPublicHeaderLengthFault(PublicHeaderLengthFault value) {
        return new JAXBElement<PublicHeaderLengthFault>(_PublicHeaderLengthFault_QNAME, PublicHeaderLengthFault.class, null, value);
    }

}
