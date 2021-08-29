
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _AddtionResponse_QNAME = new QName("http://ws/", "addtionResponse");
    private final static QName _Soustration_QNAME = new QName("http://ws/", "soustration");
    private final static QName _SoustrationResponse_QNAME = new QName("http://ws/", "soustrationResponse");
    private final static QName _Multiplication_QNAME = new QName("http://ws/", "multiplication");
    private final static QName _Addtion_QNAME = new QName("http://ws/", "addtion");
    private final static QName _MultiplicationResponse_QNAME = new QName("http://ws/", "multiplicationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddtionResponse }
     * 
     */
    public AddtionResponse createAddtionResponse() {
        return new AddtionResponse();
    }

    /**
     * Create an instance of {@link Soustration }
     * 
     */
    public Soustration createSoustration() {
        return new Soustration();
    }

    /**
     * Create an instance of {@link SoustrationResponse }
     * 
     */
    public SoustrationResponse createSoustrationResponse() {
        return new SoustrationResponse();
    }

    /**
     * Create an instance of {@link Multiplication }
     * 
     */
    public Multiplication createMultiplication() {
        return new Multiplication();
    }

    /**
     * Create an instance of {@link Addtion }
     * 
     */
    public Addtion createAddtion() {
        return new Addtion();
    }

    /**
     * Create an instance of {@link MultiplicationResponse }
     * 
     */
    public MultiplicationResponse createMultiplicationResponse() {
        return new MultiplicationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddtionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addtionResponse")
    public JAXBElement<AddtionResponse> createAddtionResponse(AddtionResponse value) {
        return new JAXBElement<AddtionResponse>(_AddtionResponse_QNAME, AddtionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soustration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "soustration")
    public JAXBElement<Soustration> createSoustration(Soustration value) {
        return new JAXBElement<Soustration>(_Soustration_QNAME, Soustration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoustrationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "soustrationResponse")
    public JAXBElement<SoustrationResponse> createSoustrationResponse(SoustrationResponse value) {
        return new JAXBElement<SoustrationResponse>(_SoustrationResponse_QNAME, SoustrationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "multiplication")
    public JAXBElement<Multiplication> createMultiplication(Multiplication value) {
        return new JAXBElement<Multiplication>(_Multiplication_QNAME, Multiplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Addtion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addtion")
    public JAXBElement<Addtion> createAddtion(Addtion value) {
        return new JAXBElement<Addtion>(_Addtion_QNAME, Addtion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "multiplicationResponse")
    public JAXBElement<MultiplicationResponse> createMultiplicationResponse(MultiplicationResponse value) {
        return new JAXBElement<MultiplicationResponse>(_MultiplicationResponse_QNAME, MultiplicationResponse.class, null, value);
    }

}
