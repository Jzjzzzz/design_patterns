package com.jzj.adapter.class_adapter;

/**
 * @Author Jzj
 * @Date 2022/1/4 11:07
 * @Version 1.0
 * 目标接口
 */
public interface SDCard {
    //从TF卡中读取数据
    String readSD();
    //往TF卡中写数据
    void writeSD(String msg);
}
