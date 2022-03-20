package improve;

import improve.observer.BaiduSite;
import improve.observer.qiXiangJu;
import improve.subject.WeatherData;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Client.java
 * @Description
 *  * 1) 气象站可以将每天测量到的温度，湿度，气压等等以公告的形式发布出去(比如发布到自己的网站或第三方)。
 *  * 2) 需要设计开放型API，便于其他第三方也能接入气象站获取数据。
 *  * 3) 提供温度、气压和湿度的接口
 *  * 4) 测量数据更新时，要能实时的通知给第三方
 *
 *   观察者模式类似订牛奶业务
 * 1) 奶站/气象局：Subject
 * 2) 用户/第三方网站：Observer
 * Subject：登记注册、移除和通知
 * 1) registerObserver 注册
 * 2) removeObserver 移除
 * 3) notifyObservers() 通知所有的注册的用户，根据不同需求，可以是更新数据，让用户来取，也可能是实施推送，看具体需求定
 *
 * Observer：接收输入
 * 观察者模式：对象之间多对一依赖的一种设计方案，被依
 * 赖的对象为Subject，依赖的对象为Observer，Subject通
 * 知Observer变化,比如这里的奶站是
 * Subject，是1的一方。用户时Observer，是多的一方。
 *
 *  观察者模式的好处
 *  1) 观察者模式设计后，会以集合的方式来管理用户(Observer)，包括注册，移除和通知。
 * 2) 这样，我们增加观察者(这里可以理解成一个新的公告板)，就不需要去修改核心类WeatherData不会修改代码，遵守了ocp原则。
 * @createTime 2022年03月20日 22:23:00
 */
public class Client {
    public static void main(String[] args) {
        //创建一个WeatherData
        WeatherData weatherData = new WeatherData();

        //创建观察者
        qiXiangJu qiXiangJu = new qiXiangJu();
        BaiduSite baiduSite = new BaiduSite();

        //注册到weatherData
        weatherData.registerObserver(qiXiangJu);
        weatherData.registerObserver(baiduSite);

        //测试
        System.out.println("通知各个注册的订阅者, 当前的天气状况");
        weatherData.setData(10f, 100f, 30.3f);


        weatherData.removeObserver(qiXiangJu);
        //测试
        System.out.println("移除了'气象局'这个订阅方  通知其余的注册的订阅者, 当前的天气状况");
        weatherData.setData(20f, 200f, 50.5f);
    }

}
