/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName OrganizationComponent.java
 * @Description 组合中对象声明接口，在适当情况下，实现所有类共有的接口默认行为，用于访问和管理
 *              Component子部件， Component可以是抽象类或者接口
 * @createTime 2022年03月18日 21:00:00
 */
public abstract class OrganizationComponent {
    private String name; // 名字
    private String des; // 说明

    protected  void add(OrganizationComponent organizationComponent) {
        //默认实现(非叶子结点重写 叶子结点直接使用  代表叶子节点不能再添加下一级)
        throw new UnsupportedOperationException();
    }

    protected  void remove(OrganizationComponent organizationComponent) {
        //默认实现
        throw new UnsupportedOperationException();
    }

    //构造器
    public OrganizationComponent(String name, String des) {
        super();
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    //方法print, 做成抽象的, 子类（叶子节点和非叶子节点）都需要实现
    protected abstract void print();

}
