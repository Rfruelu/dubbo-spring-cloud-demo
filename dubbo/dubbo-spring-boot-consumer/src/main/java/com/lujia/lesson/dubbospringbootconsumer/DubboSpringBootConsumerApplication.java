package com.lujia.lesson.dubbospringbootconsumer;

import com.lujia.lesson.dubbo.ILoginService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController()
public class DubboSpringBootConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringBootConsumerApplication.class, args);
    }


    @DubboReference()
    private ILoginService loginService;

    @GetMapping("/login")
    public String login(){
        return loginService.login("admin","123456");
    }
}
