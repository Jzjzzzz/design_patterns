package com.jzj.factory.sinple_factory;

/**
 * @Author Jzj
 * @Date 2021/12/30 18:48
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("latte");
        System.out.println(coffee.getName());
    }
}
