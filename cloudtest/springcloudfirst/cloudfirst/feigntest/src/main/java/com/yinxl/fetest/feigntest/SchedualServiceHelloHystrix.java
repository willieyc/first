package com.yinxl.fetest.feigntest;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHelloHystrix implements SchedualServiceHello {

    public String sayHelloFromClientOne(String name) {
        return "sorry " + name;
    }
}
