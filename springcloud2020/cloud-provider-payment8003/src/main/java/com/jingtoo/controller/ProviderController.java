package com.jingtoo.controller;

import com.xiaoyao.entity.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author liulei
 * @date 2020/3/30
 */
@RestController
public class ProviderController {

    @GetMapping("/payment/get")
    public CommonResult getInfo(){
        return new CommonResult(200,"port:"+ UUID.randomUUID(),null);
    }

}
