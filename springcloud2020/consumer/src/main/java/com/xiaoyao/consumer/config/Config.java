package com.xiaoyao.consumer.config;

import com.xiaoyao.intercept.FunctionInterspt;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author liulei
 * @date 2020/9/6
 */

@Configuration
public class Config {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTeplate(){
        return new RestTemplate();
    }


}
