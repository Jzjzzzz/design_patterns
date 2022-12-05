package com.jzj.observer1.improve;

/**
 * @Author Jzj
 * @Date 2022/11/30 14:25
 * @Version 1.0
 * @Message: 观察者接口，由观察者来实现
 */
public interface Observer {

    public void update(float temperature,float pressure,float humidity);
}
