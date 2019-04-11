package com.springcloud.eurekaproducer.controller.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 * Title:
 * Description:
 * Copyright: 2019 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: SpringCloudDemo
 * Author: 王杰
 * Create Time:2019/4/11 10:24
 */
@Api(value = "hello")
public interface HelloApi {


    @ApiOperation(value = "第一个服务提供者")
    @ApiImplicitParam(name = "userName", value = "用户名", dataTypeClass = String.class)
    String producerOne(String userName);
}
