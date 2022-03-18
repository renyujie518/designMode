import coffee.DeCaf;
import coffee.LongBlack;
import decorator2Coffee.Chocolate;
import decorator2Coffee.Drink;
import decorator2Coffee.Milk;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Client.java
 * @Description 咖啡店售卖咖啡+调料  加调料的过程就是装饰
 * @createTime 2022年03月18日 17:52:00
 */
public class Client {
    public static void main(String[] args) {
        // 装饰者模式下的订单：2份巧克力+一份牛奶的LongBlack

        // 1. 点一份 LongBlack  多态 最上层是Drink
        Drink order = new LongBlack();
        System.out.println("点一份LongBlack费用=" + order.cost());
        System.out.println("点一份 LongBlack---描述=" + order.getDes());

        // 2. order 加入一份牛奶
        order = new Milk(order);

        System.out.println("order 加入一份牛奶 费用 =" + order.cost());
        System.out.println("order 加入一份牛奶 描述 = " + order.getDes());

        // 3. order 加入一份巧克力

        order = new Chocolate(order);

        System.out.println("order 加入一份牛奶 加入一份巧克力  费用 =" + order.cost());
        System.out.println("order 加入一份牛奶 加入一份巧克力 描述 = " + order.getDes());

        // 3. order 加入一份巧克力

        order = new Chocolate(order);

        System.out.println("order 加入一份牛奶 加入2份巧克力   费用 =" + order.cost());
        System.out.println("order 加入一份牛奶 加入2份巧克力 描述 = " + order.getDes());

        System.out.println("===========================");
        // 装饰者模式下的订单：一份牛奶的DeCaf

        Drink order2 = new DeCaf();

        System.out.println("order2 无因咖啡  费用 =" + order2.cost());
        System.out.println("order2 无因咖啡 描述 = " + order2.getDes());

        order2 = new Milk(order2);

        System.out.println("order2 无因咖啡 加入一份牛奶  费用 =" + order2.cost());
        System.out.println("order2 无因咖啡 加入一份牛奶 描述 = " + order2.getDes());


    }

}
