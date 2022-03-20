package iterior;

import department.Department;

import java.util.Iterator;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName iterior.ComputerCollegeIterator.java
 * @Description 计算机学院迭代器 计算机学院是以数组方式存放系
 * @createTime 2022年03月20日 17:26:00
 */
public class ComputerCollegeIterator implements Iterator {
    //这里我们需要Department 是以怎样的方式存放=>数组
    Department[] departments;
    int position = 0; //遍历的位置
    //构造器
    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    //判断是否还有下一个元素
    @Override
    public boolean hasNext() {

        if(position >= departments.length || departments[position] == null) {
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    //删除的方法，默认空实现
    @Override
    public void remove() {

    }
}

