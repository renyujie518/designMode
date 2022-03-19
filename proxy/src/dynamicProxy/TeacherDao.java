package dynamicProxy;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName TeacherDao.java
 * @Description TODO
 * @createTime 2022年03月19日 16:58:00
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println(" 老师授课中.... ");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }

}
