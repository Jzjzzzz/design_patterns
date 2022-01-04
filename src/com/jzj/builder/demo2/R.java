package com.jzj.builder.demo2;

/**
 * @Author Jzj
 * @Date 2022/1/3 21:07
 * @Version 1.0
 * 测试封装返回值的异常调用(链式编程)
 */
public class R {
    private String message;
    private R(){}

    public static R ok(){
        R r = new R();
        r.setMessage("ok调用成功");
        return r;
    }
    public static R error(){
        R r = new R();
        r.setMessage("error调用成功");
        return r;
    }
    public R message(String message){
        this.setMessage(message);
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
