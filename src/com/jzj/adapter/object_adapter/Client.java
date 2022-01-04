package com.jzj.adapter.object_adapter;

/**
 * @Author Jzj
 * @Date 2022/1/4 11:11
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建计算机对象
        Computer computer = new Computer();
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);
        //使用该电脑读取TF卡中的数据
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        String msg1 = computer.readSD(sdAdapterTF);
        System.out.println(msg1);
    }
}
