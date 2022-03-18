package decorator2Coffee;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Milk.java
 * @Description 具体的Decorator， 这里就是调味品
 * @createTime 2022年03月18日 17:50:00
 */
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);

        setDes(" 牛奶 ");
        setPrice(2.0f);// 调味品 的价格


    }
}
