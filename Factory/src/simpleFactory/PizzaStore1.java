package simpleFactory;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName PizzaStore.java
 * @Description 相当于一个客户端，发出订购
 * @createTime 2022年03月15日 22:58:00
 */
public class PizzaStore1 {
    public static void main(String[] args) {

        // 使用简单工厂模式
        new OrderPizza1(new SimpleFactory());
        System.out.println("~~退出程序~~");

    }
}
