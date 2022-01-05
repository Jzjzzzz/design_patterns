package com.jzj.template;

/**
 * @Author Jzj
 * @Date 2022/1/5 12:02
 * @Version 1.0
 * 炒菜心类
 */
public class ConcreteClass_CaiXin extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的蔬菜是蒜蓉");
    }
}
