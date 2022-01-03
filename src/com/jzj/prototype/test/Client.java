package com.jzj.prototype.test;

/**
 * @Author Jzj
 * @Date 2021/12/31 17:29
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("张三");
        citation.setStu(student);
        Citation clone = citation.clone();
        clone.setName("李四");

        citation.show();
        clone.show();

    }
}
