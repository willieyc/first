package com.yinxl.cfg.cfgcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CfgcenterApplication {

    public static void main(String[] args) {

        SpringApplication.run(CfgcenterApplication.class, args);
    }
}
