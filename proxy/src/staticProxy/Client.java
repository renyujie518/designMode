package staticProxy;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Client.java
 * @Description 代理对象与目标对象要实现相同的接口, 然后通过调用相同的方法来调用目标对象的方法。
 * 静态代理：
 * 1) 优点：在不修改目标对象的功能前提下, 能通过代理对象对目标功能扩展
 * 2) 缺点：因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类
 * 3) 一旦接口增加方法,目标对象与代理对象都要维护
 * @createTime 2022年03月19日 16:46:00
 */
public class Client {
    public static void main(String[] args) {

        // 创建目标对象（被代理对象）
        TeacherDao teacherDao = new TeacherDao();

        // 创建代理对象，同时将被代理对象传递给代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        // 通过代理对象，调用到被代理对象的方法
        //即：执行的是代理对象的方法，代理对象再去调用目标对象的方法
        teacherDaoProxy.teach();
    }


}
