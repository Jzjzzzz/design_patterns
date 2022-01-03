package com.jzj.builder.demo1;

/**
 * @Author Jzj
 * @Date 2022/1/3 20:19
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建指挥者对象
        Director director = new Director(new MobileBuilder());
        //让指挥者只会组装自行车
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
