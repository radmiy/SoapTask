
package by.epamlab.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "addCustomer", namespace = "http://ws.epamlab.by/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addCustomer", namespace = "http://ws.epamlab.by/")
public class AddCustomer {

    @XmlElement(name = "arg0", namespace = "")
    private by.epamlab.beans.CustomerType arg0;

    /**
     * 
     * @return
     *     returns CustomerType
     */
    public by.epamlab.beans.CustomerType getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(by.epamlab.beans.CustomerType arg0) {
        this.arg0 = arg0;
    }

}
