/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Department.java
 * @Description 系  叶子结点
 * @createTime 2022年03月18日 21:05:00
 */
public class Department extends OrganizationComponent {
    //没有集合

    //构造器
    public Department(String name, String des) {
        super(name, des);
    }


    //add , remove 就不用写了，因为他是叶子节点（在OrganizationComponent.class中有默认实现）

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(this.getName());
    }

}
