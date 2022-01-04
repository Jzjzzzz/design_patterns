package com.jzj.flyweight;

/**
 * @Author Jzj
 * @Date 2022/1/4 18:28
 * @Version 1.0
 * L图形类（具体享元角色）
 */
public class LBox extends AbstractBox{
    @Override
    public String getShape() {
        return "L";
    }
}
