package Action;

import Person.Man;
import Person.Woman;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Action.Wait.java
 * @Description TODO
 * @createTime 2022年03月20日 16:31:00
 */
public class Wait extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println(" 男人给的评价是该歌手待定 ..");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(" 女人给的评价是该歌手待定 ..");
    }
}
