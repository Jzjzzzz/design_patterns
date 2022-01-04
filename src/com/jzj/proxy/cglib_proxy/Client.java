package com.jzj.proxy.cglib_proxy;

/**
 * @Author Jzj
 * @Date 2022/1/4 10:39
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = proxyFactory.getProxyObject();
        //调用代理对象中的sell方法卖票
        proxyObject.sell();
    }
}
