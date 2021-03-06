import duck.PekingDuck;
import duck.ToyDuck;
import duck.WildDuck;
import fly.NoFlyBehavior;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Client.java
 * @Description 有各种鸭子(比如 野鸭、北京鸭、水鸭等， 鸭子有各种行为，比如 叫、飞行等   显示鸭子的信息
 *
 *1) 策略模式（Strategy Pattern）中，定义算法族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化独
 * 立于使用算法的客户
 * 2) 这算法体现了几个设计原则，第一、把变化的代码从不变的代码中分离出来；
 * 第二、针对接口编程而不是具体类（定义了策略接口）；
 * 第三、多用组合/聚合，少用继承（客户通过组合方式使用策略）
 *
 * 原则就是：分离变化部分，封装接口，基于接口编程各种功能。此模式让行为的变化独立于算法的使用者
 *
 *
 * 1) 策略模式的关键是：分析项目中变化部分与不变部分
 * 2) 策略模式的核心思想是：多用组合/聚合 少用继承；用行为类组合，而不是行为的继承。更有弹性
 * 3) 体现了“对修改关闭，对扩展开放”原则，客户端增加行为不用修改原有代码，只要添加一种策略（或者行为）即可，
 *    避免了使用多重转移语句（if..else if..else）
 * 4) 提供了可以替换继承关系的办法： 策略模式将算法封装在独立的Strategy类中使得你可以独立于其Context改
 *    变它，使它易于切换、易于理解、易于扩展
 * 5) 需要注意的是：每添加一个策略就要增加一个类，当策略过多是会导致类数目庞大
 * @createTime 2022年03月22日 14:50:00
 */
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();

        //动态改变某个对象的行为, 北京鸭 不能飞
        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        System.out.println("北京鸭的实际飞翔能力");
        pekingDuck.fly();
    }
}
