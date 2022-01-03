package com.jzj.factory.abstract_factory;

/**
 * @Author Jzj
 * @Date 2021/12/31 3:07
 * @Version 1.0
 * 美式风味的甜品工厂
 */
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
