package com.jzj.decorator;

/**
 * @Author Jzj
 * @Date 2022/1/4 13:54
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        FastFood food = new FriedRice();
        System.out.println(food.getPrice()+food.getDesc());
        food = new Egg(food);
        System.out.println(food.getPrice()+food.getDesc());
    }
}
