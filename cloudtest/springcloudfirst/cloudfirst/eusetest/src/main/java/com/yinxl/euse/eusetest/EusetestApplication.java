package com.yinxl.euse.eusetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EusetestApplication {

    public static void main(String[] args) {

        SpringApplication.run(EusetestApplication.class, args);
    }
}
