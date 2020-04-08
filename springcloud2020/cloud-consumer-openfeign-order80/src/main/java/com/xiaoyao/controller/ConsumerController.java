package com.xiaoyao.controller;

import com.xiaoyao.entity.CommonResult;
import com.xiaoyao.entity.Payment;
import com.xiaoyao.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

/**
 * @author liulei
 * @date 2020/4/8
 */
@Controller
public class ConsumerController {



    //private static final String URL="http://127.0.0.1:8001";
    //通过在eureka注册的服务名称获取服务的地址,负载均衡
//    private static final String URL="http://PAYMENT";
//    @PostMapping("/payment/create")
//    public CommonResult create(Payment payment) {
//        return restTemplate.postForObject(URL+"/payment/create",payment,CommonResult.class);
//    }

    @Autowired
    PaymentService paymentService;

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") long id) {
        return paymentService.get(id);
    }
}
