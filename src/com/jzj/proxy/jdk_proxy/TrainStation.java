package com.jzj.proxy.jdk_proxy;

/**
 * @Author Jzj
 * @Date 2022/1/4 9:52
 * @Version 1.0
 * 火车站类
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
