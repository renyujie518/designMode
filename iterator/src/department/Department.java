package department;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName department.Department.java
 * @Description 系
 * @createTime 2022年03月20日 17:25:00
 */
public class Department {
    private String name;
    private String desc;
    public Department(String name, String desc) {
        super();
        this.name = name;
        this.desc = desc;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

}
