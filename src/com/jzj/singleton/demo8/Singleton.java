package com.jzj.singleton.demo8;

/**
 * @Author Jzj
 * @Date 2021/12/23 18:22
 * @Version 1.0
 * 单例设计模式(懒汉式):线程安全
 */
public class Singleton {
    //私有化构造方法
    private Singleton(){
        if(instance!=null){
            throw new RuntimeException();
        }
    }

    private static Singleton instance;

    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }

}
