package pizza;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName BJCheesePizza.java
 * @Description 北京的奶酪pizza
 * @createTime 2022年03月15日 23:10:00
 */
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京的奶酪pizza");
        System.out.println(" 北京的奶酪pizza 准备原材料");
    }

}
