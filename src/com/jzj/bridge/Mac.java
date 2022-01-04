package com.jzj.bridge;

/**
 * @Author Jzj
 * @Date 2022/1/4 14:18
 * @Version 1.0
 * Mac操作系统（扩展抽象化角色）
 */
public class Mac extends OpratingSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
