package com.wuruiliang.clientfeigndemo.controller;

import com.wuruiliang.clientfeigndemo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @Value("${foo}")
    String foo;

    @RequestMapping("/hello")
    public String sayHello(){
        return helloService.sayHelloFromEurekaClient();
    }

    @RequestMapping("/foo")
    public String foo(){
        return foo;
    }
}
