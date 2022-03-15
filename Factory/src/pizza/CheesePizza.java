package pizza;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName CheesePizza.java
 * @Description 奶酪披萨
 * @createTime 2022年03月15日 22:36:00
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 给制作奶酪披萨 准备原材料 ");
    }
}
