package com.jzj.bridge;

/**
 * @Author Jzj
 * @Date 2022/1/4 14:10
 * @Version 1.0
 * rmvb视频文件(具体地实现化角色)
 */
public class RmvbFile implements VideoFile{

    @Override
    public void decode(String fileName) {
        System.out.println("rmvb视频文件"+fileName);
    }
}
