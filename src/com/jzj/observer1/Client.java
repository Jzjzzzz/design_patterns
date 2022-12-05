package com.jzj.observer1;

/**
 * @Author Jzj
 * @Date 2022/11/30 11:24
 * @Version 1.0
 * @Message:
 */
public class Client {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);
        weatherData.setData(30,150,40);
    }
}
