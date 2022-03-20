package Action;

import Person.Man;
import Person.Woman;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Action.Action.java
 * @Description  Action抽象类  作为访问者
 * @createTime 2022年03月20日 16:25:00
 */
public abstract class Action {
    //得到男性 的测评
    public abstract void getManResult(Man man);

    //得到女的 测评
    public abstract void getWomanResult(Woman woman);
}
