package com.example.demo.hystrix;

import com.example.demo.inter.FeignInter;
import org.springframework.stereotype.Component;

/**
 * Created by tianlang on 2017/7/11.
 */
@Component
public class FeignHystrix implements FeignInter{

    @Override
    public Integer add(Integer a, Integer b) {
        return 9999999;
    }
}
