package com.xiaoyao.consumer.demo;

import com.xiaoyao.Function;
import com.xiaoyao.entity.CommonResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

/**
 * @author liulei
 * @date 2020/9/6
 */

@RestController
public class ConsumerController {

    String url="http://PRIVATE";

    @Resource
    RestTemplate restTemplate;

    @Function(name="获取",value="0101")
    @GetMapping("/payment/get/{id}")
    public boolean get(@PathVariable("id") int id){
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(url + "/payment/get/1", CommonResult.class);
        return entity.getStatusCode().is2xxSuccessful();
    }
    @GetMapping("/payment/ge/{id}")
    public CommonResult gt(@PathVariable("id") int id){
        return restTemplate.getForObject(url + "/payment/get/1", CommonResult.class);
    }


}
