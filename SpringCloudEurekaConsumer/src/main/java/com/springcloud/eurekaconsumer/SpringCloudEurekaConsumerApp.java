package com.springcloud.eurekaconsumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Title:
 * Description:
 * Copyright: 2019 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: SpringCloudDemo
 * Author: 王杰
 * Create Time:2019/4/11 11:24
 */
@SpringBootApplication
@EnableDiscoveryClient //启用服务注册与发现
@EnableFeignClients //启用feign进行远程调用
public class SpringCloudEurekaConsumerApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudEurekaConsumerApp.class).web(true).run(args);
    }
}
