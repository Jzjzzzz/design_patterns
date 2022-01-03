package com.jzj.singleton.demo7;

/**
 * @Author Jzj
 * @Date 2021/12/30 17:26
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance1 == instance);
    }
}
