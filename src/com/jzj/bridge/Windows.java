package com.jzj.bridge;

/**
 * @Author Jzj
 * @Date 2022/1/4 14:16
 * @Version 1.0
 * 扩展抽象化角色（windows操作系统）
 */
public class Windows extends OpratingSystem{
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
