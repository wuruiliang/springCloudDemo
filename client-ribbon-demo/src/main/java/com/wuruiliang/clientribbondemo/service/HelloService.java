package com.wuruiliang.clientribbondemo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String helloService(){
        return restTemplate.getForObject("http://eureka-client/hello", String.class);
    }

    public String error(){
        return "sorry error!";
    }

}
