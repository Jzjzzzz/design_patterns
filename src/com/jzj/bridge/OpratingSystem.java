package com.jzj.bridge;

/**
 * @Author Jzj
 * @Date 2022/1/4 14:14
 * @Version 1.0
 * 抽象的操作系统类（抽象化的角色）
 */
public abstract class OpratingSystem {
    //声明videFile变量
    protected VideoFile videoFile;

    public OpratingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }
    public abstract void play(String fileName);
}
