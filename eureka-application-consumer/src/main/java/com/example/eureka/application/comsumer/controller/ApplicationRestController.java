package com.example.eureka.application.comsumer.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Configuration
public class ApplicationRestController {



        @Bean
        @LoadBalanced
        public RestTemplate getRestTemplate() {
            return new RestTemplate();
        }

        @RequestMapping(value = "/greeting/{name}")
        public String greeting(@PathVariable("name") String name) {
            RestTemplate restTemplate = getRestTemplate();
            return restTemplate.getForObject("http://eureka-application-provider/serverName/" + name, String.class);
        }



}
