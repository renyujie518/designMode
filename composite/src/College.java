import java.util.ArrayList;
import java.util.List;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName College.java
 * @Description 学院 可以管理 Department系
 * @createTime 2022年03月18日 21:04:00
 */
public class College extends OrganizationComponent {
    //List 中 存放的Department(系)
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    // 构造器
    public College(String name, String des) {
        super(name, des);
    }

    // 重写add
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        //  将来实际业务中，Colleage 的 add 和  University add 不一定完全一样
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

    // print方法，就是输出University 包含的学院（College）
    @Override
    protected void print() {
        System.out.println("--------------" + this.getName() + "--------------");
        //遍历 organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }


}
