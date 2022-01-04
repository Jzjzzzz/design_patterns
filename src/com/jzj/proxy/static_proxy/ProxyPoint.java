package com.jzj.proxy.static_proxy;

/**
 * @Author Jzj
 * @Date 2022/1/4 9:54
 * @Version 1.0
 * 代售点类
 */
public class ProxyPoint implements SellTickets{

    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点收取一些服务费用");
        trainStation.sell();
    }
}
