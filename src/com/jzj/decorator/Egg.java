package com.jzj.decorator;

/**
 * @Author Jzj
 * @Date 2022/1/4 13:51
 * @Version 1.0
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }

    @Override
    public float cost() {
        return getPrice()+getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc()+getFastFood().getDesc();
    }
}
