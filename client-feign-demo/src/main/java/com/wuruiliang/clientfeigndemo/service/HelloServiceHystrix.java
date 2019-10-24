package com.wuruiliang.clientfeigndemo.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystrix implements HelloService {
    @Override
    public String sayHelloFromEurekaClient() {
        return "sorry error!";
    }
}
