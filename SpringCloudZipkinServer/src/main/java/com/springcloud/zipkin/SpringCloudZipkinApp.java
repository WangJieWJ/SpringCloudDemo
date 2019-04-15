package com.springcloud.zipkin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

/**
 * Title:
 * Description:
 * Copyright: 2019 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: SpringCloudDemo
 * Author: 王杰
 * Create Time:2019/4/15 16:45
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer  //启用zipkin服务
public class SpringCloudZipkinApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudZipkinApp.class).web(true).run(args);
    }
}
