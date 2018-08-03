package com.wsd.cxf.server;

import com.wsd.model.User;
import com.wsd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;

/**
 * Created by tm on 2018/8/2.
 * 服务实现类
 */
@WebService(endpointInterface = "com.wsd.cxf.server.CxfImpls")
public class CxfServices implements CxfImpls {
    @Autowired
    UserService us;
    /**
     * 不带参数测试方法
     */
    public String sayHello() {
        System.out.println("say hello cxf");
        return "cxf";
    }

    /**
     * 带参数测试方法
     * @param param
     */
    public String sayHellos(String param) {
        System.out.println("say hello cxf=>" +  param);
        return "cxf";
    }

    /**
     * 查询数据库测试方法
     * @return
     */
    public String getUser() {
        User user = us.getUser();
        System.out.println("userName=>" +  user.getName());
        return null;
    }
}
