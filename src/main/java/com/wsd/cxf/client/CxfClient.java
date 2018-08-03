package com.wsd.cxf.client;

import com.wsd.service.UserService;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by tm on 2018/8/2.
 * cxf客户端类
 */
@Component("cxfClient")
public class CxfClient {
    public static void main(String[] orgs){

        String url = "http://localhost:8081/smc/cxfs/services?wsdl";

        /* 不带参数测试方法
        String method = "sayHello";
        callWebService(url, method, new Object[]{});
        */

        /* 带参数测试方法
        String param = "jack";
        String method = "sayHellos";
        callWebService(url, method, new Object[]{param});
        */

        /* 查询数据库测试方法*/
        String method = "getUser";
        callWebService(url, method, new Object[]{});
    }
    /**
     * 调用webservice通用方法
     * @param url 服务端wsdl地址
     * @param method 服务端配置的接口实现类地址
     * @param data 服务端方法参数
     */
    public static void callWebService(String url,String method,Object...data){
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient(url);
        Object[] results = null;
        try {
            results = client.invoke(method, data);
            System.out.println("results:"+results[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
