package staticProxy;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName TeacherDaoProxy.java
 * @Description 静态代理在使用时, 需要定义接口或者父类
 * 被代理对象(即目标对象)与代理对象一起实现相同的接口或者是继承相同父类
 * @createTime 2022年03月19日 16:46:00
 */
public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao target;  // 目标对象，通过接口来聚合

    // 构造器
    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理 完成某些操作。。。。。。。");
        target.teach();
        System.out.println("提交");//
    }
}
