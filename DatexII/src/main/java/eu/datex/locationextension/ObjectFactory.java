
package eu.datex.locationextension;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.datex.locationextension package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.datex.locationextension
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link _AddressLineTypeEnum }
     * 
     */
    public _AddressLineTypeEnum create_AddressLineTypeEnum() {
        return new _AddressLineTypeEnum();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link AddressLine }
     * 
     */
    public AddressLine createAddressLine() {
        return new AddressLine();
    }

    /**
     * Create an instance of {@link FacilityLocation }
     * 
     */
    public FacilityLocation createFacilityLocation() {
        return new FacilityLocation();
    }

    /**
     * Create an instance of {@link NamedAreaExtended }
     * 
     */
    public NamedAreaExtended createNamedAreaExtended() {
        return new NamedAreaExtended();
    }

}
