package com.xiaoyao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author liulei
 * @date 2020/3/28
 */
@Configuration
public class Config {

    @Bean
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }

}
