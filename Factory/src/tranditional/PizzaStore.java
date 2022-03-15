package tranditional;

import tranditional.OrderPizza;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName PizzaStore.java
 * @Description 相当于一个客户端，发出订购
 *
 *传统的方式的优缺点
 * 1) 优点是比较好理解，简单易操作。
 * 2) 缺点是违反了设计模式的ocp原则，即对扩展开放，
 * 对修改关闭。即当我们给类增
 * 加新功能的时候，尽量不修改代码，或者尽可能少修改代码.
 * 3) 比如我们这时要新增加一个Pizza的种类(Pepper披萨)，需修改OrderPizza的if/else判断
 * @createTime 2022年03月15日 22:42:00
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza();

    }
}
