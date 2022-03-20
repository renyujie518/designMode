package colleague;

import mediator.Mediator;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName CoffeeMachine.java
 * @Description 具体的同事类 咖啡机
 * @createTime 2022年03月20日 23:46:00
 */
public class CoffeeMachine extends Colleague {
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.GetMediator().GetMessage(stateChange, this.name);
    }

    public void StartCoffee() {
        System.out.println("开始打开咖啡机");
    }

    public void FinishCoffee() {

        System.out.println("After 5 minutes!");
        System.out.println("Coffee is ok!");
        SendMessage(0);
    }

}
