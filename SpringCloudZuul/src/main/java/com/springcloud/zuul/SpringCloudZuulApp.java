package com.springcloud.zuul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Title:
 * Description: zuul测试
 * Copyright: 2019 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: SpringCloudDemo
 * Author: 王杰
 * Create Time:2019/4/15 08:49
 */
@SpringBootApplication
@EnableZuulProxy
public class SpringCloudZuulApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudZuulApp.class).web(true).run(args);
    }
}
