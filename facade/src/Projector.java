/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Projector.java
 * @Description 投影仪
 * @createTime 2022年03月18日 22:07:00
 */
public class Projector {
    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Projector on ");
    }

    public void off() {
        System.out.println(" Projector ff ");
    }

    public void focus() {
        System.out.println(" Projector is Projector  ");
    }

    //...
}
