package com.jzj.factory.sinple_factory;

/**
 * @Author Jzj
 * @Date 2021/12/30 18:58
 * @Version 1.0
 * 简单咖啡工厂类,用来生产咖啡
 */
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type){
        Coffee coffee = null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        } else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }
        return coffee;
    }
}
