package com.jzj.factory.config_factory;

/**
 * @Author Jzj
 * @Date 2021/12/31 3:39
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("american");
        System.out.println(coffee.getName());
    }
}
