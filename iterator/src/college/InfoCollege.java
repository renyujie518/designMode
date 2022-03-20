package college;

import college.College;
import department.Department;
import iterior.InfoColleageIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName college.InfoCollege.java
 * @Description 信息工程学院
 * @createTime 2022年03月20日 17:32:00
 */
public class InfoCollege implements College {
    List<Department> departmentList;


    public InfoCollege() {
        departmentList = new ArrayList<Department>();
        addDepartment("信息安全专业", " 信息安全专业 ");
        addDepartment("网络安全专业", " 网络安全专业 ");
        addDepartment("服务器安全专业", " 服务器安全专业 ");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoColleageIterator(departmentList);
    }

}
