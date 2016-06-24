package by.epamlab.client;

import by.epamlab.beans.CustomerType;
import by.epamlab.beans.EmailType;
import by.epamlab.beans.ObjectFactory;
import by.epamlab.beans.PhoneType;
import by.epamlab.ws.CustomerWebService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class CustomerClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/SoapTask/customer?wsdl");
        QName qName = new QName("http://ws.epamlab.by/", "CustomerWebServiceImplService");
        Service service = Service.create(url, qName);
        CustomerWebService customerWebService = service.getPort(CustomerWebService.class);

        System.out.println("\nGet all customers.");
        List<CustomerType> customers = customerWebService.getAllCustomers();
        printCustomers(customers);

        System.out.println("\nAdd customer with ID=\"1\".");
        ObjectFactory objectFactory = new ObjectFactory();
        CustomerType customerType = objectFactory.createCustomerType();
        customerType.setCustomerDocID("1");
        customerType.setFirstName("TestAdd");
        customerType.setLastName("Customer");
        EmailType emailType = objectFactory.createEmailType();
        emailType.setEmailAddress("test@customer.by");
        customerType.setEmail(emailType);
        PhoneType phoneType = objectFactory.createPhoneType();
        phoneType.setPhoneNumber("+123456789000");
        customerType.setPhone(phoneType);
        if(customerWebService.addCustomer(customerType) != 1) {
            System.out.println("Customer not added");
        }
        printCustomers(customerWebService.getAllCustomers());

        System.out.println("\nGet customer with ID=\"1\".");
        printCustomer(customerWebService.getCustomer("1"));

        System.out.println("\nUpdate customer with ID=\"1\".");
        CustomerType customerUpdate = customerWebService.getCustomer("1");
        customerUpdate.setFirstName("TestUpdate");
        customerUpdate.setLastName("CustomerUpdate");
        EmailType emailUpdate = customerUpdate.getEmail();
        emailUpdate.setEmailAddress("update@customer.by");
        customerType.setEmail(emailUpdate);
        PhoneType phoneUpdate = customerUpdate.getPhone();
        phoneUpdate.setPhoneNumber("+123456789999");
        customerType.setPhone(phoneUpdate);
        if(customerWebService.updateCustomer(customerUpdate) != 1) {
            System.out.println("Customer not updated");
        }
        printCustomers(customerWebService.getAllCustomers());

        System.out.println("\nDelete customer with ID=\"1\".");
        if(customerWebService.deleteCustomer("1") != 1) {
            System.out.println("Customer not deleted");
        }
        printCustomers(customerWebService.getAllCustomers());
    }

    private static void printCustomers(List<CustomerType> customers) {
        for (CustomerType customer : customers) {
            printCustomer(customer);
        }
    }

    private static void printCustomer(CustomerType customer) {
        if (customer != null && customer.getCustomerDocID() != null) {
            System.out.println(customer.toString());
        } else {
            System.out.println("Customer not found.");
        }
    }
}
