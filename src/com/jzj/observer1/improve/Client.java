package com.jzj.observer1.improve;



/**
 * @Author Jzj
 * @Date 2022/11/30 14:43
 * @Version 1.0
 * @Message:
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions();
        BaiDuSite baiDuSite = new BaiDuSite();
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiDuSite);
        weatherData.setData(10,50,30);
    }
}
