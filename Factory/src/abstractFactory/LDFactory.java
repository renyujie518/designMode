package abstractFactory;

import pizza.LDCheesePizza;
import pizza.LDPepperPizza;
import pizza.Pizza;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName LDFactory.java
 * @Description 假如新增伦敦pizza
 * @createTime 2022年03月15日 23:13:00
 */
public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }

}

