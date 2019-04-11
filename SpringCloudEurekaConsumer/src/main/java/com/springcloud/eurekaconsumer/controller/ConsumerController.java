package com.springcloud.eurekaconsumer.controller;

import com.springcloud.eurekaconsumer.client.HelloRemote;
import com.springcloud.eurekaconsumer.controller.api.ConsumerApi;
import org.springframework.beans.factory.annotation.Autowired;
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
 * Create Time:2019/4/11 13:23
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController implements ConsumerApi {


    @Autowired
    private HelloRemote helloRemote;

    @Override
    @PostMapping("/hello")
    public String consumer(String userName) {
        return helloRemote.producerOne(userName);
    }
}
