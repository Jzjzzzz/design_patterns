package com.jzj.strategy;

/**
 * @Author Jzj
 * @Date 2022/1/5 12:22
 * @Version 1.0
 * 具体策略类：封装算法
 */
public class StrategyC implements Strategy{
    @Override
    public void show() {
        System.out.println("满1000元加一元换购任意200元以下商品");
    }
}
