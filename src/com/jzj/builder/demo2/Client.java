package com.jzj.builder.demo2;

/**
 * @Author Jzj
 * @Date 2022/1/3 20:42
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        R r = R.ok().message("调用成功ok");
        R r2 = R.error().message("调用成功error");
        System.out.println(r == r2);
        System.out.println(r.getMessage() );
        System.out.println(r2.getMessage() );

        Phone phone = new Phone.Builder()
                .cpu("intel")
                .screen("三星屏幕")
                .memory("金士顿内存条")
                .mainboard("华硕主板")
                .build();
        System.out.println(phone);
    }
}
