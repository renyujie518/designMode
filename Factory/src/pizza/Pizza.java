package pizza;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName pizza.java
 * @Description 披萨抽象类
 * @createTime 2022年03月15日 22:29:00
 */
//一个抽象工厂模式的抽象层(接口)
public abstract class Pizza {
    protected String name; //名字

    //准备原材料, 不同的披萨不一样，因此，我们做成抽象方法
    public abstract void prepare();


    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }



}
