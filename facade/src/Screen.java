/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Screen.java
 * @Description 屏幕
 * @createTime 2022年03月18日 22:08:00
 */
public class Screen {
    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println(" Screen up ");
    }

    public void down() {
        System.out.println(" Screen down ");
    }
}
