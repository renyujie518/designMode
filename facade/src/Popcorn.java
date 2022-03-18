/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Popcorn.java
 * @Description 爆米花
 * @createTime 2022年03月18日 22:06:00
 */
public class Popcorn {
    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" popcorn on ");
    }

    public void off() {
        System.out.println(" popcorn off ");
    }

    public void pop() {
        System.out.println(" popcorn is poping  ");
    }

}
