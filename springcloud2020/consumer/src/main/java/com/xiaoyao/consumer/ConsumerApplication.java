package com.xiaoyao.consumer;

import com.xiaoyao.myRule.MyRule;
import com.xiaoyao.myRule.MyRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(configuration= MyRule.class,name = "PRIVATE")
public class ConsumerApplication {
	//11

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

}
