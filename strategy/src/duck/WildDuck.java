package duck;

import fly.GoodFlyBehavior;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName WildDuck.java
 * @Description 野鸭飞行技术好
 * @createTime 2022年03月22日 14:48:00
 */
public class WildDuck extends Duck{
    //构造器，传入FlyBehavor 的对象
    public  WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }


    @Override
    public void display() {
        System.out.println(" 野鸭 ");
    }

}
