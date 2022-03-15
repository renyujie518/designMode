package pizza;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName GreekPizza.java
 * @Description 希腊披萨
 * @createTime 2022年03月15日 22:36:00
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 给希腊披萨 准备原材料 ");
    }
}
