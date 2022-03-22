package fly;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName fly.NoFlyBehavior.java
 * @Description TODO
 * @createTime 2022年03月22日 14:43:00
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
