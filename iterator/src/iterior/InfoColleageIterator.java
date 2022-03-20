package iterior;

import department.Department;

import java.util.Iterator;
import java.util.List;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName iterior.InfoColleageIterator.java
 * @Description 信息工程学院迭代器   信息工程学院是以List方式存放系、
 * 待遍历的容器对象List通过依赖注入传递到迭代器类中
 * @createTime 2022年03月20日 17:28:00
 */
public class InfoColleageIterator implements Iterator {
    List<Department> departmentList; // 信息工程学院是以List方式存放系
    int index = -1;//索引
    //构造函数
    public InfoColleageIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    //判断list中还有没有下一个元素
    @Override
    public boolean hasNext() {
        if(index >= departmentList.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    //空实现remove
    @Override
    public void remove() {

    }

}
