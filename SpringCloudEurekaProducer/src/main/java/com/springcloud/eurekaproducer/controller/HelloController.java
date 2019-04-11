package com.springcloud.eurekaproducer.controller;

import com.springcloud.eurekaproducer.controller.api.HelloApi;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title:
 * Description:
 * Copyright: 2019 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: SpringCloudDemo
 * Author: 王杰
 * Create Time:2019/4/11 10:23
 */
@RestController
@RequestMapping("/hello")
public class HelloController implements HelloApi {

    @PostMapping("/producerOne")
    public String producerOne(String userName) {
        return "Hello " + userName + "，This is firstProducer";
    }
}
