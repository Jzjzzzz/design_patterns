package com.jzj.decorator;

/**
 * @Author Jzj
 * @Date 2022/1/4 13:51
 * @Version 1.0
 */
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood) {
        super(2, "培根", fastFood);
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
