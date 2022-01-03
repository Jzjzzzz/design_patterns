package com.jzj.builder.demo1;

/**
 * @Author Jzj
 * @Date 2022/1/3 20:08
 * @Version 1.0
 */
public abstract class Builder {
    //声明Bike类型的变量，并进行赋值
    protected Bike bike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();

    //构建自行车的方法
    public abstract Bike createBike();
}
