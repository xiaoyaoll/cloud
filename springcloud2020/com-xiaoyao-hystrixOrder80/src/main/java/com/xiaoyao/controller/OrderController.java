package com.xiaoyao.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.conf.HystrixPropertiesManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.naming.TimeLimitExceededException;

/**
 * @author liulei
 * @date 2020/4/12
 */
@Controller
@ResponseBody
//@DefaultProperties(fallbackMethod="get_timeout_global")
public class OrderController {

    @Value("${server.port}")
    private long port;

    @GetMapping("/order/get/{id}")
    @HystrixCommand(fallbackMethod="get_timeout",commandProperties={
            //超时
            @HystrixProperty(name= HystrixPropertiesManager.EXECUTION_ISOLATION_THREAD_TIMEOUT_IN_MILLISECONDS,value="3000")

    })
    public String get_normal(@PathVariable("id") long id) throws InterruptedException {
        //Thread.sleep(4000);
        int i=1/0;
        return "项目端口是:"+port;
    }


    public String get_timeout(long id){
        return "操作繁忙,请稍后重试";
    }
    /**
    * 全局fallback
    * @author LIULEI
    * @date 2020/4/12
     * @param id
    * @return java.lang.String
    */
    public String get_timeout_global(long id){
        return "操作繁忙,请稍后重试";
    }
    /**
    * 服务熔断
    * @author LIULEI
    * @date 2020/4/13
     * @param id
    * @return java.lang.String
    */
    @GetMapping("/order/get_breaker/{id}")
    @HystrixCommand(defaultFallback = "get_breakerManager_no",commandProperties={
        @HystrixProperty(name =HystrixPropertiesManager.CIRCUIT_BREAKER_ENABLED ,value="true"),//开启熔断策略
        @HystrixProperty(name =HystrixPropertiesManager.CIRCUIT_BREAKER_ERROR_THRESHOLD_PERCENTAGE ,value="20"),//错误概率阈值
        @HystrixProperty(name =HystrixPropertiesManager.CIRCUIT_BREAKER_REQUEST_VOLUME_THRESHOLD ,value="10"),//规定时间内的最大请求数
        @HystrixProperty(name =HystrixPropertiesManager.CIRCUIT_BREAKER_SLEEP_WINDOW_IN_MILLISECONDS ,value="10000"),//默认尝试恢复调用链路时间

    })
    public String get_breaker(@PathVariable("id") long id) throws InterruptedException {
        if(id<0){
            int i=1/0;
        }
        return "项目端口是:"+port;
    }
    public String get_breakerManager(@PathVariable("id")long id){
        return "系统维护中....";
    }
    public String get_breakerManager_no(){
        return "系统维护中....";
    }
}
