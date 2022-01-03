package com.jzj.factory.factory_method;

/**
 * @Author Jzj
 * @Date 2021/12/31 2:49
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        CoffeeFactory factory = new AmericanCoffeeFactory();
        store.setFactory(factory);
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
