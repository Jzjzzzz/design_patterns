package com.jzj.factory.factory_method;


/**
 * @Author Jzj
 * @Date 2021/12/30 18:43
 * @Version 1.0
 */
public class CoffeeStore {
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory){
        this.factory = factory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}
