package com.jzj.factory.factory_method;

/**
 * @Author Jzj
 * @Date 2021/12/31 2:43
 * @Version 1.0
 * 抽象工厂
 */
public interface CoffeeFactory {

    //创建咖啡对象的方法
    Coffee createCoffee();
}
