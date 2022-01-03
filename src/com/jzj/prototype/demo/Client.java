package com.jzj.prototype.demo;

/**
 * @Author Jzj
 * @Date 2021/12/31 17:19
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) throws Exception{
        Realizetype realizetype = new Realizetype();
        Realizetype clone = realizetype.clone();
        System.out.println(realizetype == clone);
    }
}
