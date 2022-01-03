package com.jzj.factory.abstract_factory;

/**
 * @Author Jzj
 * @Date 2021/12/31 3:09
 * @Version 1.0
 * 意大利风味的甜品工厂
 * 拿铁，提拉米苏
 */
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
