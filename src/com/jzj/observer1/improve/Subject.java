package com.jzj.observer1.improve;

/**
 * @Author Jzj
 * @Date 2022/11/30 14:24
 * @Version 1.0
 * @Message:
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
