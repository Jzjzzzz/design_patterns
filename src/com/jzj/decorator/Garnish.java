package com.jzj.decorator;

/**
 * @Author Jzj
 * @Date 2022/1/4 13:47
 * @Version 1.0
 * 装饰者类
 */
public abstract class Garnish extends FastFood {
    //声明快餐类的变量
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }


    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
