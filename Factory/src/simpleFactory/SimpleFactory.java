package simpleFactory;

import pizza.CheesePizza;
import pizza.GreekPizza;
import pizza.PepperPizza;
import pizza.Pizza;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName SimpleFactory.java
 * @Description 简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例
 * 定义一个可以实例化pizaa对象的类，封装创建对象的代码。
 * @createTime 2022年03月15日 22:45:00
 */
public class SimpleFactory {
    //更加orderType 返回对应的Pizza 对象
    public Pizza createPizza1(String orderType) {

        Pizza pizza = null;

        System.out.println("使用简单工厂模式1");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }

    //简单工厂模式 也叫 静态工厂模式

    public static Pizza createPizza2(String orderType) {

        Pizza pizza = null;

        System.out.println("使用简单工厂模式2");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }

}
