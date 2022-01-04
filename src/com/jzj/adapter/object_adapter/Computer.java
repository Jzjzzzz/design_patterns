package com.jzj.adapter.object_adapter;

/**
 * @Author Jzj
 * @Date 2022/1/4 11:09
 * @Version 1.0
 * 计算机类
 */
public class Computer {
    //从SD卡中读取数据
    public String readSD(SDCard sdCard){
        if(sdCard ==null){
            throw new NullPointerException("sd card is not null");
        }
        return sdCard.readSD();
    }
}
