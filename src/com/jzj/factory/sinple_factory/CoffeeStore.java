package com.jzj.factory.sinple_factory;

/**
 * @Author Jzj
 * @Date 2021/12/30 18:43
 * @Version 1.0
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.createCoffee(type);
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}
