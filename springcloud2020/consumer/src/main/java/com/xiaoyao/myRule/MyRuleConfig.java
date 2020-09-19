package com.xiaoyao.myRule;

import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liulei
 * @date 2020/9/6
 */

@Configuration
public class MyRuleConfig {

    @Bean
    public RandomRule getRandomRule(){
        return new RandomRule();
    }

}

class MyRuleR implements IRule {

    public Server choose(Object key) {
        return null;
    }

    public void setLoadBalancer(ILoadBalancer lb) {

    }

    public ILoadBalancer getLoadBalancer() {
        return null;
    }
}