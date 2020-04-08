package com.xiaoyao.service;

import com.xiaoyao.entity.CommonResult;
import com.xiaoyao.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author liulei
 * @date 2020/4/8
 */
@FeignClient(value="PAYMENT")
@Component
public interface PaymentService {


    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") long id);

}
