/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName SoyaMilk.java
 * @Description 抽象类，表示豆浆
 *
 * 模板方法模式 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中，使得子类可以不改变一个算法的结构，就可以重定义该算法的某些特定步骤
 * @createTime 2022年03月19日 19:17:00
 */
public abstract class SoyaMilk {
    //模板方法, make , 模板方法可以做成final , 不让子类去覆盖.
    final void make() {
        select();
        addCondiments();
        soak();
        beat();

    }

    //选材料
    void select() {
        System.out.println("第一步：选择好的新鲜黄豆  ");
    }

    //添加不同的配料， 抽象方法, 子类具体实现
    abstract void addCondiments();

    //浸泡
    void soak() {
        System.out.println("第三步， 黄豆和配料开始浸泡， 需要3小时 ");
    }

    void beat() {
        System.out.println("第四步：黄豆和配料放到豆浆机去打碎  ");
    }

}
