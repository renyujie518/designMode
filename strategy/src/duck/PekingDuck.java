package duck;

import fly.BadFlyBehavior;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName PekingDuck.java
 * @Description 北京鸭可以飞翔，但是飞翔技术一般
 * @createTime 2022年03月22日 14:47:00
 */
public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("~~北京鸭~~~");
    }
}
