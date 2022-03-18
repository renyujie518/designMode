/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName ConcreteWebSite.java
 * @Description 具体网站
 * @createTime 2022年03月18日 22:43:00
 */
public class ConcreteWebSite extends WebSite{
    //共享的部分，内部状态
    private String type = ""; //网站发布的形式(类型)


    //构造器
    public ConcreteWebSite(String type) {

        this.type = type;
    }


    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为:" + type + " 在使用中 .. 使用者是" + user.getName());
    }


}
