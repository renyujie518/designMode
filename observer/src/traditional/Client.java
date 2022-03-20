package traditional;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Client.java
 * @Description
 * 1) 气象站可以将每天测量到的温度，湿度，气压等等以公告的形式发布出去(比如发布到自己的网站或第三方)。
 * 2) 需要设计开放型API，便于其他第三方也能接入气象站获取数据。
 * 3) 提供温度、气压和湿度的接口
 * 4) 测量数据更新时，要能实时的通知给第三方
 *
 * 问题：
 * 1) 其他第三方接入气象站获取数据的问题
 * 2) 无法在运行时动态的添加第三方 (新浪网站)
 * 3) 违反ocp原则=>观察者模式
 * //在WeatherData中，当增加一个第三方（百度），都需要创建一个对应的第三方的公告板对象，并加入到dataChange, 不利于维护，也
 * 不是动态加入
 * public void dataChange() {
 * currentConditions.update(getTemperature(), getPressure(), getHumidity());
 * }
 * @createTime 2022年03月20日 22:15:00
 */
public class Client {
    public static void main(String[] args) {
        //创建接入方 currentConditions
        CurrentConditions currentConditions = new CurrentConditions();
        //创建 WeatherData 并将 接入方 currentConditions 传递到 WeatherData中
        WeatherData weatherData = new WeatherData(currentConditions);

        //更新天气情况
        weatherData.setData(30, 150, 40);

        //天气情况变化
        System.out.println("============天气情况变化=============");
        weatherData.setData(40, 160, 20);


    }

}
