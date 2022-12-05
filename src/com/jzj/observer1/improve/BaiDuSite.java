package com.jzj.observer1.improve;

/**
 * @Author Jzj
 * @Date 2022/11/30 14:50
 * @Version 1.0
 * @Message:
 */
public class BaiDuSite implements Observer{

    private float temperature;
    private float pressure;
    private float humidity;
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("百度 mTemperature:"+temperature+"***");
        System.out.println("百度 mPressure:"+pressure+"***");
        System.out.println("百度 mHumidity:"+humidity+"***");
    }
}
