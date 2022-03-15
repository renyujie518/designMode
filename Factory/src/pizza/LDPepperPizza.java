package pizza;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName LDPepperPizza.java
 * @Description 伦敦的胡椒pizza
 * @createTime 2022年03月15日 23:12:00
 */
public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦的胡椒pizza");
        System.out.println(" 伦敦的胡椒pizza 准备原材料");
    }
}

