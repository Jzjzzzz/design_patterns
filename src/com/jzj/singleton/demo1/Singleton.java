package com.jzj.singleton.demo1;

/**
 * @Author Jzj
 * @Date 2021/12/13 16:46
 * @Version 1.0
 * 单例设计模式(饿汉式)：静态成员变量
 */
public class Singleton {
    //私有化构造方法
    private Singleton(){}

    //本类中创建本类对象
    private static Singleton instance = new Singleton();

    //提供一个公共的访问方法，让外界获取该对象
    public static Singleton getInstance(){
        return instance;
    }
}
