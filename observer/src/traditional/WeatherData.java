package traditional;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName WeatherData.java
 * @Description 核心类（相当于iot平台收集到的最新信息）
 *  * 1. 包含最新的天气情况信息
 *  * 2. 含有 CurrentConditions 对象
 *  * 3. 当数据有更新时，就主动的调用
 *       CurrentConditions对象update方法(含 display), 这样他们（接入方：气象网站）就看到最新的信息
 * @createTime 2022年03月20日 22:13:00
 */
public class WeatherData {
    private float temperatrue;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;
    //加入新的第三方

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
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
        currentConditions.update(getTemperature(), getPressure(), getHumidity());
    }

    //当数据有更新时，就调用 setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperatrue = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange， 将最新的信息 推送给 接入方（气象网站） currentConditions
        dataChange();
    }
}
