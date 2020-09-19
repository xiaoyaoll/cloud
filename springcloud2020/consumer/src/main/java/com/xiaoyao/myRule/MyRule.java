package com.xiaoyao.myRule;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liulei
 * @date 2020/9/7
 */
@Configuration
public class MyRule {

    @Bean
    public RandomRule getRandomRule(){

        return new RandomRule();
    }

}
