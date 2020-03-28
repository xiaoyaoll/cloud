package com.xiaoyao.Controller;

import com.xiaoyao.entity.CommonResult;
import com.xiaoyao.entity.Payment;
import com.xiaoyao.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author liulei
 * @date 2020/3/27
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @PostMapping("/payment/create")
    public CommonResult create(Payment payment){
        int i = paymentService.create(payment);
        if(i==1){
            return new CommonResult(200,"新增成功,port:"+port,1);
        }else{
            return new CommonResult(500,"新增失败",null);
        }
    };

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") long id){
        Payment payment = paymentService.get(id);
        if(payment!=null){
            return new CommonResult(200,"查询成功,port:"+port,payment);
        }else{
            return new CommonResult(500,"查询失败",null);
        }
    };



}
