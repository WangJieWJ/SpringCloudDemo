package com.springcloud.eurekaconsumer.hystrix;

import com.springcloud.eurekaconsumer.client.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Title:
 * Description:
 * Copyright: 2019 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: SpringCloudDemo
 * Author: 王杰
 * Create Time:2019/4/11 17:29
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String producerOne(@RequestParam(value = "userName") String userName) {
        return "服务暂时不可用，请稍后重试！当前userName:" + userName;
    }
}
