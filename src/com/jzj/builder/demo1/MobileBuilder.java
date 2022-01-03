package com.jzj.builder.demo1;

/**
 * @Author Jzj
 * @Date 2022/1/3 20:11
 * @Version 1.0
 * 具体的构建者，用来构建摩拜单车对象
 */
public class MobileBuilder extends Builder{

    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
