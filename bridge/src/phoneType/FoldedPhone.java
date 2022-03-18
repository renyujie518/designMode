package phoneType;

import phoneBrand.Brand;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName FoldedPhone.java
 * @Description 折叠手机
 * @createTime 2022年03月18日 15:24:00
 */
public class FoldedPhone extends Phone {

    //构造器
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println(" 这是种折叠样式手机 ");
    }

    @Override
    public void close() {
        super.close();
        System.out.println(" 这是种折叠样式手机 ");
    }

    @Override
    public void call() {
        super.call();
        System.out.println(" 这是种折叠样式手机 ");
    }
}
