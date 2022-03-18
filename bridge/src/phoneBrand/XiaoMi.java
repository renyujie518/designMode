package phoneBrand;

import phoneBrand.Brand;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName phoneBrand.XiaoMi.java
 * @Description TODO
 * @createTime 2022年03月18日 15:21:00
 */
public class XiaoMi implements Brand {

    @Override
    public void open() {
        System.out.println(" 小米手机开机 ");
    }

    @Override
    public void close() {
        System.out.println(" 小米手机关机 ");
    }

    @Override
    public void call() {
        System.out.println(" 小米手机打电话 ");
    }
}
