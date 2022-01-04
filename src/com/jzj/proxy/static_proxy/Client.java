package com.jzj.proxy.static_proxy;

/**
 * @Author Jzj
 * @Date 2022/1/4 9:55
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建代售点类对象
        ProxyPoint proxyPoint = new ProxyPoint();
        //调用方法进行买票
        proxyPoint.sell();
    }
}
