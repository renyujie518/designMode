package improve.subject;

import improve.observer.Observer;

import java.util.ArrayList;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName WeatherData.java
 * @Description 相当于iot平台收集到的最新信息
 * @createTime 2022年03月20日 22:22:00
 */
public class WeatherData implements Subject {
    private float temperatrue;
    private float pressure;
    private float humidity;
    //订阅者集合
    private ArrayList<Observer> observers;

    //加入新的第三方

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {
        //调用 接入方的 update
        notifyObservers();
    }

    //当数据有更新时，就调用 setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperatrue = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange， 将最新的信息 推送给订阅者
        dataChange();
    }

    //注册一个订阅者
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    //移除一个订阅者
    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o)) {
            observers.remove(o);
        }
    }

    //遍历所有的订阅者，并通知
    @Override
    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperatrue, this.pressure, this.humidity);
        }
    }


}
