package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by tianlang on 2017/7/11.
 */
@RestController
public class consumerCntroller {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
       // return restTemplate.getForEntity("http://localhost:2222/add?a=9&b=2",String.class).getBody();
        return restTemplate.getForObject("http://localhost:2222/add?a=9&b=2",String.class);
    }
}
