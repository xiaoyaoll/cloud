package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liulei
 * @date 2020/3/30
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderMain8003 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderMain8003.class);
    }
}
