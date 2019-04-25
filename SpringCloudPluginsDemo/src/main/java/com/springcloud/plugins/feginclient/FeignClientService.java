package com.springcloud.plugins.feginclient;


import feign.*;

import java.util.Map;

/**
 * Title:
 * Description:
 * Copyright: 2019 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: SpringCloudDemo
 * Author: 王杰
 * Create Time:2019/4/25 11:31
 */
public interface FeignClientService {

    /**
     * 传基本类型参数
     */
    @RequestLine("POST /demo/findPage?pageNo={pageNo}&pageSize={pageSize}&name={name}")
    String findPage(@Param(value = "pageNo") Integer pageNo, @Param(value = "pageSize") Integer pageSize, @Param(value = "name") String name);

    /**
     * 传Map传参数
     * @param param
     * @return
     */
    @RequestLine("POST /demo/findPage")
    String findPageByMap(@QueryMap Map<String, Object> param);

    /**
     * 传对象
     * @return
     */
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /demo/findPage?pageNo={pageNo}&pageSize={pageSize}&name={name}")
    String findPageByBody();
}
