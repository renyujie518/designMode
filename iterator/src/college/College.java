package college;

import java.util.Iterator;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName college.College.java
 * @Description 学院
 * @createTime 2022年03月20日 17:29:00
 */
public interface College {
    public String getName();

    //增加系的方法
    public void addDepartment(String name, String desc);

    //返回一个迭代器,遍历
    public Iterator createIterator();

}
