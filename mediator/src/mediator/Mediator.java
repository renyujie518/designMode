package mediator;

import colleague.Colleague;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Mediator.java
 * @Description 中介者抽象类
 * @createTime 2022年03月20日 23:41:00
 */
public abstract class Mediator {
    //将给中介者对象，加入到集合中
    public abstract void Register(String colleagueName, Colleague colleague);

    //接收消息, 具体的同事对象发出
    public abstract void GetMessage(int stateChange, String colleagueName);

    //中介也可以发消息
    public abstract void SendMessage();

}
