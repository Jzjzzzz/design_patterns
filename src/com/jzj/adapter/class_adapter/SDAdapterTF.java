package com.jzj.adapter.class_adapter;

/**
 * @Author Jzj
 * @Date 2022/1/4 11:14
 * @Version 1.0
 * 适配器类
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{
    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
