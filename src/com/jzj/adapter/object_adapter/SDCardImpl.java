package com.jzj.adapter.object_adapter;

/**
 * @Author Jzj
 * @Date 2022/1/4 11:07
 * @Version 1.0
 * 具体的SD卡
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "SDCard read msg : hello word SDCard";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg:" +msg);
    }
}
