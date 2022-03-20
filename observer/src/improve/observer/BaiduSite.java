package improve.observer;

import improve.observer.Observer;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName BaiduSite.java
 * @Description 模拟百度需要天气数据
 * @createTime 2022年03月20日 22:23:00
 */
public class BaiduSite implements Observer {
    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    // 更新 天气情况
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    // 显示
    public void display() {
        System.out.println("===百度网站====");
        System.out.println("百度网站 气温 : " + temperature + "***");
        System.out.println("百度网站 气压: " + pressure + "***");
        System.out.println("百度网站 湿度: " + humidity + "***");
    }

}
