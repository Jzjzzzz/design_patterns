package com.jzj.builder.demo1;

/**
 * @Author Jzj
 * @Date 2022/1/3 20:15
 * @Version 1.0
 * ofo单车构建者，用来构建ofo单车
 */
public class ofoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
