package com.xiaoyao.service;

import com.xiaoyao.entity.CommonResult;
import com.xiaoyao.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author liulei
 * @date 2020/9/7
 */
@FeignClient(value="PRIVATE")
public interface OpenService {

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") int id);


}
