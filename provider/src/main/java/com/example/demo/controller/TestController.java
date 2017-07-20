package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.logging.Logger;

/**
 * Created by tianlang on 2017/7/11.
 */
@RestController
public class TestController {

    //private final Logger logger =Logger.getLogger("TestController.class");

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b){

        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        System.out.print("host端口" + serviceInstance.getHost());
        System.out.print("service_ID" + serviceInstance.getServiceId());
        System.out.print("URL" + serviceInstance.getUri());
        return a+b;
    }
}
