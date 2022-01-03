package com.jzj.prototype.demo;

/**
 * @Author Jzj
 * @Date 2021/12/31 17:16
 * @Version 1.0
 */
public class Realizetype implements Cloneable{
    public Realizetype() {
        System.out.println("具体原型对象创建完成！");
    }

    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功!");
        return (Realizetype) super.clone();
    }
}
