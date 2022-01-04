package com.jzj.combination;

/**
 * @Author Jzj
 * @Date 2022/1/4 18:15
 * @Version 1.0
 * 菜单组件：属于抽象根节点
 */
public class MenuComponent {
    //菜单组件的名称
    protected String name;
    //菜单组件的层级
    protected int level;

    //添加子菜单
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    //移除子菜单
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
}
