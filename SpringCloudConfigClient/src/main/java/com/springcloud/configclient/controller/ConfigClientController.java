package com.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title:
 * Description:
 * Copyright: 2019 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: SpringCloudDemo
 * Author: 王杰
 * Create Time:2019/4/11 19:21
 */
@RestController
@RequestMapping("client")
public class ConfigClientController {

    @Value("${requestURL}")
    private String requestURL;


    public String getConfigValue() {
        return "获取到的requestURL为:" + requestURL;
    }
}
