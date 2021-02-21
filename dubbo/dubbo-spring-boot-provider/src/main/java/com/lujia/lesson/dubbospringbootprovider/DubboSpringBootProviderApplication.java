package com.lujia.lesson.dubbospringbootprovider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan(basePackages = {"com.lujia.lesson.dubbospringbootprovider.service"})
public class DubboSpringBootProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringBootProviderApplication.class, args);
    }

}
