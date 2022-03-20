package colleague;

import mediator.Mediator;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Colleague.java
 * @Description 同事抽象类  会聚合中介类
 * @createTime 2022年03月20日 23:38:00
 */
public abstract class Colleague {
    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {

        this.mediator = mediator;
        this.name = name;

    }

    public Mediator GetMediator() {
        return this.mediator;
    }

    public abstract void SendMessage(int stateChange);

}
