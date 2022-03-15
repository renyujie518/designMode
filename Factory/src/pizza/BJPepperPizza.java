package pizza;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName BJPepperPizza.java
 * @Description 北京的胡椒pizza
 * @createTime 2022年03月15日 23:09:00
 */
public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京的胡椒pizza");
        System.out.println(" 北京的胡椒pizza 准备原材料");
    }
}
