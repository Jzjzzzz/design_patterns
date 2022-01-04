package com.jzj.adapter.object_adapter;

/**
 * @Author Jzj
 * @Date 2022/1/4 11:04
 * @Version 1.0
 * 适配者类
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg = "TFCard read msg : hello word TFCard";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg:" +msg);
    }
}
