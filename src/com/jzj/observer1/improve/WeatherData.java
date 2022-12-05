package com.jzj.observer1.improve;

import java.util.ArrayList;

/**
 * @Author Jzj
 * @Date 2022/11/30 11:19
 * @Version 1.0
 * @Message: 含有观察者集合,使用ArrayList管理
 */
public class WeatherData implements Subject{
    private float temperature;
    private float pressure;
    private float humidity;

    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void dataChange(){
        notifyObserver();
    }

    public void setData(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperature,this.pressure,this.humidity);
        }
    }
}
