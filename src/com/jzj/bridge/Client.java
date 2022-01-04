package com.jzj.bridge;

/**
 * @Author Jzj
 * @Date 2022/1/4 14:20
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        OpratingSystem sy = new Mac(new AviFile());
        sy.play("战狼");
    }
}
