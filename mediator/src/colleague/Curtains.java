package colleague;

import mediator.Mediator;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Curtains.java
 * @Description 具体的同事类 窗帘
 * @createTime 2022年03月20日 23:43:00
 */
public class Curtains extends Colleague{
    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.GetMediator().GetMessage(stateChange, this.name);
    }

    public void UpCurtains() {
        System.out.println("我升起了窗帘");
    }

}
