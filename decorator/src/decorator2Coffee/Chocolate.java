package decorator2Coffee;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Chocolate.java
 * @Description 具体的Decorator， 这里就是调味品
 * @createTime 2022年03月18日 17:49:00
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDes(" 巧克力 ");
        setPrice(3.0f); // 调味品 的价格
    }

}
