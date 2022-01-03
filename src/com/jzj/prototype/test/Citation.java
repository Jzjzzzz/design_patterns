package com.jzj.prototype.test;

/**
 * @Author Jzj
 * @Date 2021/12/31 17:23
 * @Version 1.0
 */
public class Citation implements Cloneable {
    //三好学生上的姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
    public void show(){
        System.out.println(stu.getName() +"同学：在2020年第一学期中表现优秀，被评为三好学生!");
    }


}
