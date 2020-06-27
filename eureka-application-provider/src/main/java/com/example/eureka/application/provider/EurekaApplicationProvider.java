package com.example.eureka.application.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaApplicationProvider {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicationProvider.class, args);
    }

}
