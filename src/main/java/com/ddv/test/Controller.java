package com.ddv.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @Autowired
    private IGateway gateway;
    
    @GetMapping("/init")
    public void init() {
        gateway.addBook();
    }
}
