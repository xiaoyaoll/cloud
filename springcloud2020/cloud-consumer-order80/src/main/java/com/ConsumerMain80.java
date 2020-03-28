package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liulei
 * @date 2020/3/27
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerMain80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain80.class);
    }
}
