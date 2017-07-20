package com.example.demo.inter;

import com.example.demo.hystrix.FeignHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by tianlang on 2017/7/11.
 */
@FeignClient(name = "compute-service",fallback = FeignHystrix.class)
public interface FeignInter {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}
