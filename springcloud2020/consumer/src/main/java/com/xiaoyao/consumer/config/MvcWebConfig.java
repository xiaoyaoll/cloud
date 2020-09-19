package com.xiaoyao.consumer.config;

import com.xiaoyao.intercept.FunctionInterspt;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author liulei
 * @date 2020/9/19
 */
@Configuration
public class MvcWebConfig implements WebMvcConfigurer {

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new FunctionInterspt());
    }
}
