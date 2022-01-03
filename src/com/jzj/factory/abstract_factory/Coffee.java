package com.jzj.factory.abstract_factory;

/**
 * @Author Jzj
 * @Date 2021/12/30 18:40
 * @Version 1.0
 * 咖啡类
 */
public abstract class Coffee {
    public abstract String getName();

    public void addsugar(){
        System.out.println("加糖");
    }

    public void addMilk(){
        System.out.println("加奶");
    }
}
