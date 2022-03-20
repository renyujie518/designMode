package traditional;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName CurrentConditions.java
 * @Description 显示当前天气情况（可以理解成是气象站自己的网站）
 * @createTime 2022年03月20日 22:12:00
 */
public class CurrentConditions {
    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    //更新 天气情况，是由 WeatherData 来调用，我使用推送模式   一更新就显示
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示
    public void display() {
        System.out.println("Today Temperature: " + temperature + "***");
        System.out.println("Today Pressure: " + pressure + "***");
        System.out.println("Today Humidity: " + humidity + "***");
    }

}
