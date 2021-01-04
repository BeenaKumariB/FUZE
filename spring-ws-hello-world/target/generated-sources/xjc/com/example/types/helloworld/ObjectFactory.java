//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.23 at 04:44:00 PM IST 
//


package com.example.types.helloworld;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.types.helloworld package. 
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

    private final static QName _Purchase_QNAME = new QName("http://example.com/types/helloworld", "purchase");
    private final static QName _Purchaselist_QNAME = new QName("http://example.com/types/helloworld", "purchaselist");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.types.helloworld
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PurchaseType }
     * 
     */
    public PurchaseType createPurchaseType() {
        return new PurchaseType();
    }

    /**
     * Create an instance of {@link PurchaseListType }
     * 
     */
    public PurchaseListType createPurchaseListType() {
        return new PurchaseListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PurchaseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/types/helloworld", name = "purchase")
    public JAXBElement<PurchaseType> createPurchase(PurchaseType value) {
        return new JAXBElement<PurchaseType>(_Purchase_QNAME, PurchaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PurchaseListType }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/types/helloworld", name = "purchaselist")
    public JAXBElement<PurchaseListType> createPurchaselist(PurchaseListType value) {
        return new JAXBElement<PurchaseListType>(_Purchaselist_QNAME, PurchaseListType.class, null, value);
    }

}
