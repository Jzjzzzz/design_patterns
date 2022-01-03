package com.jzj.factory.abstract_factory;

/**
 * @Author Jzj
 * @Date 2021/12/31 3:10
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        ItalyDessertFactory factory = new ItalyDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
