package com.example.eureka.application.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationRestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(path = "/serverName/{serverName}")
    public String getServerName(@PathVariable String serverName){
        System.out.println(port);
        return serverName;
    }

}
