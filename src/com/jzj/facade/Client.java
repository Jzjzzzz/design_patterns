package com.jzj.facade;

/**
 * @Author Jzj
 * @Date 2022/1/4 14:38
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        facade.say("打开家电");
        facade.say("关闭家电");
    }
}
