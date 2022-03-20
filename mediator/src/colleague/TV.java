package colleague;

import mediator.Mediator;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName TV.java
 * @Description 具体的同事类 电视
 * @createTime 2022年03月20日 23:44:00
 */
public class TV extends Colleague{
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.GetMediator().GetMessage(stateChange, this.name);
    }

    public void StartTv() {
        System.out.println("开始打开电视");
    }

    public void StopTv() {
        System.out.println("关闭电视!");
    }

}
