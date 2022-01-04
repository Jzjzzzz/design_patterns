package com.jzj.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author Jzj
 * @Date 2022/1/4 10:02
 * @Version 1.0
 * 获取代理对象的工厂类
 * 代理类也实现了对应的接口
 */
public class ProxyFactory {
    //声明目标对象
    private TrainStation station = new TrainStation();
    public SellTickets getProxyObject(){
        //返回代理对象
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     *
                     * @param proxy 代理对象，和proxyObject对象是同一个对象，在invoke方法中基本不用
                     * @param method 对接口中的方法进行封装的method对象
                     * @param args 调用方法的实际参数
                     * @return 方法的返回值
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代售点收取一定的服务费用");
                        //执行目标对象的方法
                        Object object = method.invoke(station, args);
                        return object;
                    }
                }
        );
        return proxyObject;
    }
}
