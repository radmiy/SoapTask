
package by.epamlab.ws.jaxws;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAllCustomersResponse", namespace = "http://ws.epamlab.by/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllCustomersResponse", namespace = "http://ws.epamlab.by/")
public class GetAllCustomersResponse {

    @XmlElement(name = "return", namespace = "")
    private ArrayList<by.epamlab.beans.CustomerType> _return;

    /**
     * 
     * @return
     *     returns ArrayList<CustomerType>
     */
    public ArrayList<by.epamlab.beans.CustomerType> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ArrayList<by.epamlab.beans.CustomerType> _return) {
        this._return = _return;
    }

}
