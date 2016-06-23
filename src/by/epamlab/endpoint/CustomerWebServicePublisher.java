package by.epamlab.endpoint;

import by.epamlab.ws.CustomerWebServiceImpl;

import javax.xml.ws.Endpoint;

public class CustomerWebServicePublisher {
    public static void main(String[] args) {
        Object implementor = new CustomerWebServiceImpl();
        String address = "http://localhost:1986/wss/customer";
        Endpoint.publish(address, implementor);
    }
}
