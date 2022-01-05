package com.jzj.template;

/**
 * @Author Jzj
 * @Date 2022/1/5 12:02
 * @Version 1.0
 * 炒包菜类
 */
public class ConcreteClass_BaoCai extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的蔬菜是辣椒");
    }
}
