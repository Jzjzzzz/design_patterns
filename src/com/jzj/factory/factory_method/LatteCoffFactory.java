package com.jzj.factory.factory_method;

/**
 * @Author Jzj
 * @Date 2021/12/31 2:45
 * @Version 1.0
 * 拿铁咖啡工厂
 */
public class LatteCoffFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
