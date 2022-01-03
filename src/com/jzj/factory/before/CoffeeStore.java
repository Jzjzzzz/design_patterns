package com.jzj.factory.before;

/**
 * @Author Jzj
 * @Date 2021/12/30 18:43
 * @Version 1.0
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        Coffee coffee = null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        } else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }
        //加配料
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}
