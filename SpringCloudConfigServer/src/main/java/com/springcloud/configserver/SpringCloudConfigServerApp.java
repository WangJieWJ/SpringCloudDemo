package com.springcloud.configserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Title:
 * Description:
 * Copyright: 2019 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: SpringCloudDemo
 * Author: 王杰
 * Create Time:2019/4/11 17:49
 */
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudConfigServerApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudConfigServerApp.class).web(true).run(args);
    }
}
