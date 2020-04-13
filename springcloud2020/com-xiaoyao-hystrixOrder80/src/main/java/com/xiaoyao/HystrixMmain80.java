package com.xiaoyao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author liulei
 * @date 2020/4/12
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class HystrixMmain80 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixMmain80.class);
    }
}
