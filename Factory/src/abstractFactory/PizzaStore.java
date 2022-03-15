package abstractFactory;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName PizzaStore.java
 * @Description 相当于一个客户端，发出订购
 * @createTime 2022年03月15日 23:14:00
 */
public class PizzaStore {
    public static void main(String[] args) {
        //new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }
}
