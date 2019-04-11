package com.springcloud.eurekaconsumer.client;

import com.springcloud.eurekaconsumer.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Title:
 * Description:
 * Copyright: 2019 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: SpringCloudDemo
 * Author: 王杰
 * Create Time:2019/4/11 11:38
 */
//application-name
@FeignClient(name = "spring-cloud-eureka-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    // context-path/request-path
    @PostMapping(value = "/spring-cloud-eureka-producer/hello/producerOne")
    String producerOne(@RequestParam(value = "userName") String userName);
}
