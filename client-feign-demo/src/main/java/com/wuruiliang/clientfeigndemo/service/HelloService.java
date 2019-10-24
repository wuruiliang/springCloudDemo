package com.wuruiliang.clientfeigndemo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-client")
public interface HelloService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHelloFromEurekaClient();

}
