package com.li.bank1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@ComponentScan({"com.li.bank1","org.dromara.hmily"})
public class Bank1Application {

    public static void main(String[] args) {
        SpringApplication.run(Bank1Application.class, args);
    }

}
