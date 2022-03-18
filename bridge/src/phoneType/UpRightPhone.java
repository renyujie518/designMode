package phoneType;

import phoneBrand.Brand;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName UpRightPhone.java
 * @Description 直立式手机
 * @createTime 2022年03月18日 15:25:00
 */
public class UpRightPhone extends Phone {
    //构造函数
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println(" 这是种直立样式手机 ");
    }

    @Override
    public void close() {
        super.close();
        System.out.println(" 这是种直立样式手机 ");
    }

    @Override
    public void call() {
        super.call();
        System.out.println(" 这是种直立样式手机 ");
    }
}
