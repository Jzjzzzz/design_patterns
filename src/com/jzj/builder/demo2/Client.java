package com.jzj.builder.demo2;

/**
 * @Author Jzj
 * @Date 2022/1/3 20:42
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        Phone phone = new Phone.Builder()
                .cpu("intel")
                .screen("三星屏幕")
                .memory("金士顿内存条")
                .mainboard("华硕主板")
                .build();
        System.out.println(phone);
    }
}
