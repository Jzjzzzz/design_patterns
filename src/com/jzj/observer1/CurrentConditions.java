package com.jzj.observer1;

/**
 * @Author Jzj
 * @Date 2022/11/30 11:14
 * @Version 1.0
 * @Message: 显示当前天气情况
 */
public class CurrentConditions {
    private float temperature;
    private float pressure;
    private float humidity;


    //更新
    public void update(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示
    private void display() {
        System.out.println("Today mTemperature:"+temperature+"***");
        System.out.println("Today mPressure:"+pressure+"***");
        System.out.println("Today mHumidity:"+humidity+"***");
    }

}
