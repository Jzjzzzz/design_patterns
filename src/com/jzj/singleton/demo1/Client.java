package com.jzj.singleton.demo1;

/**
 * @Author Jzj
 * @Date 2021/12/13 16:49
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance);
    }
}
