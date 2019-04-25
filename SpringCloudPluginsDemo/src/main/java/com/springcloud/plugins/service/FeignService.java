package com.springcloud.plugins.service;

import com.springcloud.plugins.feginclient.FeignClientService;
import feign.Feign;
import feign.Request;
import feign.Retryer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Title:
 * Description:
 * Copyright: 2019 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: SpringCloudDemo
 * Author: 王杰
 * Create Time:2019/4/25 11:27
 */
@Service
public class FeignService {


    private static final Logger LOGGER = LoggerFactory.getLogger(FeignService.class);

    public static void main(String[] args) {
        FeignClientService feignClientService = Feign.builder()
                .retryer(new Retryer.Default())
                .target(FeignClientService.class, "http://hzy.haier.com/vipWeChat");

        LOGGER.info(feignClientService.findPage(1, 1, "1"));

        Map<String, Object> requestParam = new HashMap<>();
        requestParam.put("pageNo", 1);
        requestParam.put("pageSize", 1);
        requestParam.put("name", 1);
        LOGGER.info(feignClientService.findPageByMap(requestParam));

    }

}
