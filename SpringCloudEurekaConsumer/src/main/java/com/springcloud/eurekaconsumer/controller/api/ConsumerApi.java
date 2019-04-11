package com.springcloud.eurekaconsumer.controller.api;

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
 * Create Time:2019/4/11 13:23
 */
@Api
public interface ConsumerApi {

    @ApiOperation(value = "consumer")
    @ApiImplicitParam(name = "userName", value = "用户名", dataTypeClass = String.class)
    String consumer(String userName);
}
