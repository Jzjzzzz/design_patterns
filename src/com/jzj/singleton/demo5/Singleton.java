package com.jzj.singleton.demo5;

/**
 * @Author Jzj
 * @Date 2021/12/30 17:04
 * @Version 1.0
 * 双重检查锁方式
 * 双重检查锁模式是一种非常好的单例实现模式，解决了单例、性能、线程安全问题，上面的双重检测锁模式看上去完美无缺，其实是存在问题，
 * 在多线程的情况下，可能会出现空指针问题，出现问题的原因是JVM在实例化对象的时候会进行优化和指令重排序操作。
 * 要解决双重检查锁模式带来空指针异常的问题，只需要使用 volatile 关键字, volatile 关键字可以保证可见性和有序性。
 */
public class Singleton {
    //私有构造方法
    private Singleton(){}

    private static volatile Singleton instance;

    public static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
