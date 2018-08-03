package com.wsd.cxf.server;

import javax.jws.WebService;

/**
 * Created by tm on 2018/8/2.
 * 服务接口类
 */
@WebService
public interface CxfImpls {
    /**
     * 不带参数测试服务
     */
    public String sayHello();

    /**
     * 带参数测试服务
     * @param param
     */
    public String sayHellos(String param);

    /**
     * 查询数据库测试服务
     * @param param
     */
    public String getUser();
}
