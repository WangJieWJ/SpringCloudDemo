package com.springcloud.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Title:
 * Description:
 * Copyright: 2019 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: SpringCloudDemo
 * Author: 王杰
 * Create Time:2019/4/8 14:37
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudEurekaApp.class).web(true).run(args);
    }
}
