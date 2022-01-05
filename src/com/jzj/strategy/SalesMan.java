package com.jzj.strategy;

/**
 * @Author Jzj
 * @Date 2022/1/5 12:26
 * @Version 1.0
 * 促销员（环境类）
 */
public class SalesMan {
    private Strategy strategy;
    public SalesMan(Strategy strategy){
        this.strategy = strategy;
    }
    public void salesManShow(){
        strategy.show();
    }
}
