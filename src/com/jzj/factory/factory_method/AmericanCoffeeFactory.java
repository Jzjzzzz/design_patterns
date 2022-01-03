package com.jzj.factory.factory_method;

/**
 * @Author Jzj
 * @Date 2021/12/31 2:44
 * @Version 1.0
 * 美式咖啡工厂对象
 */
public class AmericanCoffeeFactory implements CoffeeFactory{

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
