package com.x.controller;

import com.xiaoyao.entity.CommonResult;
import com.xiaoyao.entity.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liulei
 * @date 2020/9/6
 */
@RestController
public class PribateController {

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") long id) throws InterruptedException {
        CommonResult<Payment> result = new CommonResult<>();
        Payment payment = new Payment();
        payment.setId(1);
        payment.setName("port:1");
        result.setData(payment);
        Thread.sleep(2000);
        return result;
    };
}
