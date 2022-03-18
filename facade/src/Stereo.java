/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Stereo.java
 * @Description 音响
 * @createTime 2022年03月18日 22:08:00
 */
public class Stereo {

    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Stereo on ");
    }

    public void off() {
        System.out.println(" Screen off ");
    }

    public void up() {
        System.out.println(" Screen up.. ");
    }

    //...
}
