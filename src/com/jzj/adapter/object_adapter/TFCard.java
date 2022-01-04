package com.jzj.adapter.object_adapter;

/**
 * @Author Jzj
 * @Date 2022/1/4 11:03
 * @Version 1.0
 */
public interface TFCard {
    //从TF卡中读取数据
    String readTF();
    //往TF卡中写数据
    void writeTF(String msg);
}
