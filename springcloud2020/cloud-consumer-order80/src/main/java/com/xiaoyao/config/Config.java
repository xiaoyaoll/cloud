package com.xiaoyao.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
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
    @LoadBalanced//添加负载均衡能力,轮询
    //就是RestTemplate发起一个请求，这个请求被LoadBalancerInterceptor给拦截了，
    // 拦截后将请求的地址中的服务逻辑名转为具体的服务地址，然后继续执行请求，就是这么一个过程。
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }

}
