package com.jzj.decorator;

/**
 * @Author Jzj
 * @Date 2022/1/4 13:44
 * @Version 1.0
 * 炒面类
 */
public class FriedNoodles extends FastFood{
    public FriedNoodles(){
        super(12,"炒面");
    }
    @Override
    public float cost() {
        return getPrice();
    }
}
