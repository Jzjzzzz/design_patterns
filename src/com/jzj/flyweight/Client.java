package com.jzj.flyweight;

/**
 * @Author Jzj
 * @Date 2022/1/4 18:35
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        AbstractBox box1 = BoxFactory.getInstance().getShape("I");
        box1.display("灰色");

        AbstractBox box2 = BoxFactory.getInstance().getShape("O");
        box2.display("白色");
    }
}
