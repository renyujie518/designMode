package staticProxy;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName TeacherDao.java
 * @Description TODO
 * @createTime 2022年03月19日 16:45:00
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println(" 老师授课中  。。。。。");
    }
}
