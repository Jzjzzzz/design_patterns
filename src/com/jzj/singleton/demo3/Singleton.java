package com.jzj.singleton.demo3;

/**
 * @Author Jzj
 * @Date 2021/12/23 11:23
 * @Version 1.0
 * 单例设计模式(懒汉式):线程不安全
 */
public class Singleton {
    //私有化构造方法
    private Singleton(){}

    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
