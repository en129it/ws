package com.ddv.test;

import javax.xml.bind.JAXBElement;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.ddv.test.wsdl.AddBookRequest;
import com.ddv.test.wsdl.AddBookResponse;

public class GatewayImpl extends WebServiceGatewaySupport implements IGateway {

    public AddBookResponse addBook() {
        AddBookRequest request = new AddBookRequest();
        request.setAuthor("Toto");
        request.setTitle("Toto Diary");
        
        JAXBElement<AddBookResponse> response = (JAXBElement<AddBookResponse>)getWebServiceTemplate().marshalSendAndReceive(request, new SoapActionCallback(""));
        return response.getValue();
    }
}
