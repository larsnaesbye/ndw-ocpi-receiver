
package eu.datex.statefulpush;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import eu.datex.exchangeinformation.ExchangeInformation;
import eu.datex.messagecontainer.MessageContainer;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.datex.statefulpush package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _PutDataInput_QNAME = new QName("http://datex2.eu/wsdl/statefulPush/2020", "putDataInput");
    private final static QName _PutDataOutput_QNAME = new QName("http://datex2.eu/wsdl/statefulPush/2020", "putDataOutput");
    private final static QName _PutSnapshotDataInput_QNAME = new QName("http://datex2.eu/wsdl/statefulPush/2020", "putSnapshotDataInput");
    private final static QName _PutSnapshotDataOutput_QNAME = new QName("http://datex2.eu/wsdl/statefulPush/2020", "putSnapshotDataOutput");
    private final static QName _OpenSessionInput_QNAME = new QName("http://datex2.eu/wsdl/statefulPush/2020", "openSessionInput");
    private final static QName _OpenSessionOutput_QNAME = new QName("http://datex2.eu/wsdl/statefulPush/2020", "openSessionOutput");
    private final static QName _CloseSessionInput_QNAME = new QName("http://datex2.eu/wsdl/statefulPush/2020", "closeSessionInput");
    private final static QName _CloseSessionOutput_QNAME = new QName("http://datex2.eu/wsdl/statefulPush/2020", "closeSessionOutput");
    private final static QName _KeepAliveInput_QNAME = new QName("http://datex2.eu/wsdl/statefulPush/2020", "keepAliveInput");
    private final static QName _KeepAliveOutput_QNAME = new QName("http://datex2.eu/wsdl/statefulPush/2020", "keepAliveOutput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.datex.statefulpush
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageContainer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MessageContainer }{@code >}
     */
    @XmlElementDecl(namespace = "http://datex2.eu/wsdl/statefulPush/2020", name = "putDataInput")
    public JAXBElement<MessageContainer> createPutDataInput(MessageContainer value) {
        return new JAXBElement<MessageContainer>(_PutDataInput_QNAME, MessageContainer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeInformation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExchangeInformation }{@code >}
     */
    @XmlElementDecl(namespace = "http://datex2.eu/wsdl/statefulPush/2020", name = "putDataOutput")
    public JAXBElement<ExchangeInformation> createPutDataOutput(ExchangeInformation value) {
        return new JAXBElement<ExchangeInformation>(_PutDataOutput_QNAME, ExchangeInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageContainer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MessageContainer }{@code >}
     */
    @XmlElementDecl(namespace = "http://datex2.eu/wsdl/statefulPush/2020", name = "putSnapshotDataInput")
    public JAXBElement<MessageContainer> createPutSnapshotDataInput(MessageContainer value) {
        return new JAXBElement<MessageContainer>(_PutSnapshotDataInput_QNAME, MessageContainer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeInformation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExchangeInformation }{@code >}
     */
    @XmlElementDecl(namespace = "http://datex2.eu/wsdl/statefulPush/2020", name = "putSnapshotDataOutput")
    public JAXBElement<ExchangeInformation> createPutSnapshotDataOutput(ExchangeInformation value) {
        return new JAXBElement<ExchangeInformation>(_PutSnapshotDataOutput_QNAME, ExchangeInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeInformation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExchangeInformation }{@code >}
     */
    @XmlElementDecl(namespace = "http://datex2.eu/wsdl/statefulPush/2020", name = "openSessionInput")
    public JAXBElement<ExchangeInformation> createOpenSessionInput(ExchangeInformation value) {
        return new JAXBElement<ExchangeInformation>(_OpenSessionInput_QNAME, ExchangeInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeInformation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExchangeInformation }{@code >}
     */
    @XmlElementDecl(namespace = "http://datex2.eu/wsdl/statefulPush/2020", name = "openSessionOutput")
    public JAXBElement<ExchangeInformation> createOpenSessionOutput(ExchangeInformation value) {
        return new JAXBElement<ExchangeInformation>(_OpenSessionOutput_QNAME, ExchangeInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeInformation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExchangeInformation }{@code >}
     */
    @XmlElementDecl(namespace = "http://datex2.eu/wsdl/statefulPush/2020", name = "closeSessionInput")
    public JAXBElement<ExchangeInformation> createCloseSessionInput(ExchangeInformation value) {
        return new JAXBElement<ExchangeInformation>(_CloseSessionInput_QNAME, ExchangeInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeInformation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExchangeInformation }{@code >}
     */
    @XmlElementDecl(namespace = "http://datex2.eu/wsdl/statefulPush/2020", name = "closeSessionOutput")
    public JAXBElement<ExchangeInformation> createCloseSessionOutput(ExchangeInformation value) {
        return new JAXBElement<ExchangeInformation>(_CloseSessionOutput_QNAME, ExchangeInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeInformation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExchangeInformation }{@code >}
     */
    @XmlElementDecl(namespace = "http://datex2.eu/wsdl/statefulPush/2020", name = "keepAliveInput")
    public JAXBElement<ExchangeInformation> createKeepAliveInput(ExchangeInformation value) {
        return new JAXBElement<ExchangeInformation>(_KeepAliveInput_QNAME, ExchangeInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeInformation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExchangeInformation }{@code >}
     */
    @XmlElementDecl(namespace = "http://datex2.eu/wsdl/statefulPush/2020", name = "keepAliveOutput")
    public JAXBElement<ExchangeInformation> createKeepAliveOutput(ExchangeInformation value) {
        return new JAXBElement<ExchangeInformation>(_KeepAliveOutput_QNAME, ExchangeInformation.class, null, value);
    }

}
