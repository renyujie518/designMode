package duck;

import fly.NoFlyBehavior;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName ToyDuck.java
 * @Description 玩具鸭 特殊 重写父类的所有方法
 * @createTime 2022年03月22日 14:49:00
 */
public class ToyDuck extends Duck {
    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }

    //需要重写父类的所有方法
    @Override
    public void quack() {
        System.out.println("玩具鸭不能叫~~");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳~~");
    }

}
