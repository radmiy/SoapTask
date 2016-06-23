package by.epamlab.ws;

import by.epamlab.beans.CustomerType;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface CustomerWebService {
    @WebMethod
    ArrayList<CustomerType> getAllCustomers();

    @WebMethod
    CustomerType getCustomer(String id);

    @WebMethod
    int addCustomer(CustomerType customer);

    @WebMethod
    int updateCustomer(CustomerType customer);

    @WebMethod
    int deleteCustomer(String id);
}
