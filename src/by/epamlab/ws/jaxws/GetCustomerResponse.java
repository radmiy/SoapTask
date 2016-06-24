
package by.epamlab.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getCustomerResponse", namespace = "http://ws.epamlab.by/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerResponse", namespace = "http://ws.epamlab.by/")
public class GetCustomerResponse {

    @XmlElement(name = "return", namespace = "")
    private by.epamlab.beans.CustomerType _return;

    /**
     * 
     * @return
     *     returns CustomerType
     */
    public by.epamlab.beans.CustomerType getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(by.epamlab.beans.CustomerType _return) {
        this._return = _return;
    }

}
