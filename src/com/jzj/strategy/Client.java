package com.jzj.strategy;

/**
 * @Author Jzj
 * @Date 2022/1/5 12:27
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();
    }
}
