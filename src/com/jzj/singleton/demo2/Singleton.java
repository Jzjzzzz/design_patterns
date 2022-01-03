package com.jzj.singleton.demo2;

/**
 * @Author Jzj
 * @Date 2021/12/23 11:10
 * @Version 1.0
 * 单例设计模式(饿汉式):静态代码块
 */
public class Singleton {

    //私有化构造方法
    private Singleton(){}

    private static Singleton instance;

    static {
        instance = new Singleton();
    }
    public static Singleton getInstance(){
        return instance;
    }
}
