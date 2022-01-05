package com.jzj.strategy;

/**
 * @Author Jzj
 * @Date 2022/1/5 12:22
 * @Version 1.0
 * 具体策略类：封装算法
 */
public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("满200，减50");
    }
}
