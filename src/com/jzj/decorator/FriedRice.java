package com.jzj.decorator;

/**
 * @Author Jzj
 * @Date 2022/1/4 13:42
 * @Version 1.0
 * 炒饭（具体构建角色）
 */
public class FriedRice extends FastFood{
    public FriedRice() {
        super(10,"炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
