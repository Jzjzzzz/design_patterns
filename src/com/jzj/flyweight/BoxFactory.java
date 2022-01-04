package com.jzj.flyweight;

import java.util.HashMap;

/**
 * @Author Jzj
 * @Date 2022/1/4 18:30
 * @Version 1.0
 * 工厂类，将该类设计为单例
 */
public class BoxFactory {
    private HashMap<String,AbstractBox> map;

    //在构造方法中进行初始化操作
    private BoxFactory(){
        map = new HashMap<String,AbstractBox>();
        map.put("I",new IBox());
        map.put("L",new LBox());
        map.put("O",new OBox());
    }
    //根据名称获取图形对象
    public AbstractBox getShape(String name){
        return map.get(name);
    }
    //提供一个方法获取该工厂类对象
    public static BoxFactory getInstance(){
        return factory;
    }
    private static BoxFactory factory = new BoxFactory();
}
