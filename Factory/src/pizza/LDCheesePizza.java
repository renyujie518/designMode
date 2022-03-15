package pizza;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName LDCheesePizza.java
 * @Description 伦敦的奶酪pizza
 * @createTime 2022年03月15日 23:11:00
 */
public class LDCheesePizza extends Pizza{

    @Override
    public void prepare() {
        setName("伦敦的奶酪pizza");
        System.out.println(" 伦敦的奶酪pizza 准备原材料");
    }
}

