package Person;

import Action.Action;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Person.Person.java
 * @Description 给访问者提供接收方法
 * @createTime 2022年03月20日 16:25:00
 */
public abstract class Person {
    //提供一个方法，让访问者可以访问
    public abstract void accept(Action action);
}
