package com.xiaoyao.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.conf.HystrixPropertiesManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liulei
 * @date 2020/9/13
 */
@RestController
public class controller {


    @GetMapping("/get")
    @HystrixCommand(defaultFallback = "helloDef" ,commandProperties = {
            @HystrixProperty(name=HystrixPropertiesManager.EXECUTION_ISOLATION_THREAD_TIMEOUT_IN_MILLISECONDS,value = "2000")
    })
    public String hello() throws InterruptedException {
        Thread.sleep(3000);
        return "hrllo";
    }
    public String helloDef() throws InterruptedException {
        return "hrlloworld!";
    }

}
