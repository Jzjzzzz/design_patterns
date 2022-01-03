package com.jzj.factory.abstract_factory;

/**
 * @Author Jzj
 * @Date 2021/12/31 3:06
 * @Version 1.0
 *
 */
public interface DessertFactory {
    //生产咖啡的功能
    Coffee createCoffee();

    //生产甜品的功能
    Dessert createDessert();
}
