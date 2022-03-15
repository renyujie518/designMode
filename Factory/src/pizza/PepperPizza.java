package pizza;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName PepperPizza.java
 * @Description 胡椒pizza
 * @createTime 2022年03月15日 22:39:00
 */
public class PepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 给胡椒披萨准备原材料 ");
    }
}
