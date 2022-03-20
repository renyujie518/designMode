import Action.Action;
import Person.Person;

import java.util.LinkedList;
import java.util.List;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName ObjectStructure.java
 * @Description 数据结构，管理很多人（Person.Man , Person.Woman）
 * @createTime 2022年03月20日 16:29:00
 */
public class ObjectStructure {
    //维护了一个集合
    private List<Person> persons = new LinkedList<>();

    //增加到list
    public void attach(Person p) {
        persons.add(p);
    }
    //移除
    public void detach(Person p) {
        persons.remove(p);
    }

    //显示测评情况
    public void display(Action action) {
        for(Person p: persons) {
            p.accept(action);
        }
    }
}
