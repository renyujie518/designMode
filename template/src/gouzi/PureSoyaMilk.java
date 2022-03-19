package gouzi;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName PureSoyaMilk.java
 * @Description 纯豆浆
 * @createTime 2022年03月19日 19:23:00
 */
public class PureSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        //空实现
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }

}
