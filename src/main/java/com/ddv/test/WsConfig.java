package com.ddv.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class WsConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller rslt = new Jaxb2Marshaller();
        rslt.setPackagesToScan("com.ddv.test.wsdl");
        return rslt;
    }
    
    @Bean
    public IGateway isoUserDetailsGateway(Jaxb2Marshaller marshaller) {
        GatewayImpl rslt = new GatewayImpl();
        rslt.setDefaultUri("http://localhost:8080/service");
        rslt.setMarshaller(marshaller);
        return rslt;
    }
}
