package decorator2Coffee;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Soy.java
 * @Description 具体的Decorator， 这里就是调味品
 * @createTime 2022年03月18日 17:51:00
 */
public class Soy extends Decorator{

    public Soy(Drink obj) {
        super(obj);
        setDes(" 豆浆  ");
        setPrice(1.5f);// 调味品 的价格
    }

}