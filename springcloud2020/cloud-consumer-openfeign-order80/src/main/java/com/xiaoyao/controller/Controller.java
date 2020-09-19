package com.xiaoyao.controller;

import com.xiaoyao.entity.CommonResult;
import com.xiaoyao.entity.Payment;
import com.xiaoyao.service.OpenService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author liulei
 * @date 2020/9/7
 */
@RestController
public class Controller {

    @Resource
    OpenService openService;

    @GetMapping("/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") int id){
        return openService.get(id);
    }


}
