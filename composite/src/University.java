import java.util.ArrayList;
import java.util.List;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName University.java
 * @Description 学校  可以管理 College学院
 * @createTime 2022年03月18日 21:01:00
 */
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    // 构造器
    public University(String name, String des) {
        super(name, des);
    }

    // 重写add
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    // 重写remove
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    // print方法，就是输出University学校 包含的College学院
    @Override
    protected void print() {
        System.out.println("--------------" + this.getName() + "--------------");
        //遍历 organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
