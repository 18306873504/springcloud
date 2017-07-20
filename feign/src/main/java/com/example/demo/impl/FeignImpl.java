package com.example.demo.impl;

import com.example.demo.inter.FeignInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tianlang on 2017/7/11.
 */

@RestController
public class FeignImpl {

    @Autowired
    FeignInter feignInter;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b){
        return feignInter.add(a,b);
    }}

