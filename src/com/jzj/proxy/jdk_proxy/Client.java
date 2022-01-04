package com.jzj.proxy.jdk_proxy;

/**
 * @Author Jzj
 * @Date 2022/1/4 10:09
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();

        System.out.println(proxyObject.getClass());
        while (true){}
    }
}
