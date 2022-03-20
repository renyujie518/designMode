import colleague.Alarm;
import colleague.CoffeeMachine;
import colleague.Curtains;
import colleague.TV;
import mediator.ConcreteMediator;
import mediator.Mediator;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Client.java
 * @Description
 *  主人要看电视时，各个设备可以协同工作，自动完成看电视的准备工作，比如流程为：
 *             闹铃响起->咖啡机开始做咖啡->窗帘自动落下->电视机开始播放
 *
 * 原理：
 * 1) Mediator就是抽象中介者，定义了同事对象到中介者对象的接口
 * 2) Colleague是抽象同事类
 * 3) Concretemediator具体的中介者对象，实现抽象方法，他需要知道所有的具体的同事类，
 *    即以一个集合来管理Hashmap，并接受某个同事对象消息，完成相应的任务
 * 4) ConcreteColleague具体的同事类，会有很多，每个同事只知道自己的行为，而不了解其他同事类的行为（方法）,但是他
 *    们都依赖中介者对象
 *
 * 中介者模式优缺点：
 * 1) 多个类相互耦合，会形成网状结构, 使用中介者模式将网状结构分离为星型结构，进行解耦
 * 2) 减少类间依赖，降低了耦合，符合迪米特原则
 * 3) 中介者承担了较多的责任，一旦中介者出现了问题，整个系统就会受到影响
 * 4) 如果设计不当，中介者对象本身变得过于复杂，这点在实际使用时，要特别注意
 * @createTime 2022年03月20日 23:47:00
 */
public class Client {
    public static void main(String[] args) {
        //创建一个中介者对象
        Mediator mediator = new ConcreteMediator();

        //创建Alarm 并且在构造的时候会加入到  ConcreteMediator 对象的HashMap
        Alarm alarm = new Alarm(mediator, "alarm");
        //创建了CoffeeMachine 对象，并且在构造的时候会加入到  ConcreteMediator 对象的HashMap
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
        //创建 Curtains , 并且在构造的时候会加入到 ConcreteMediator 对象的HashMap
        Curtains curtains = new Curtains(mediator, "curtains");
        //创建 TV , 并且在构造的时候会加入到 ConcreteMediator 对象的HashMap
        TV tV = new TV(mediator, "TV");

        //让闹钟发出消息
        alarm.SendAlarm(0);
        coffeeMachine.FinishCoffee();
        alarm.SendAlarm(1);
    }

}
