package phoneBrand;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName phoneBrand.Vivo.java
 * @Description TODO
 * @createTime 2022年03月18日 15:20:00
 */
public class Vivo implements Brand {

    @Override
    public void open() {
        System.out.println(" Vivo手机开机 ");
    }

    @Override
    public void close() {
        System.out.println(" Vivo手机关机 ");
    }

    @Override
    public void call() {
        System.out.println(" Vivo手机打电话 ");
    }
}
