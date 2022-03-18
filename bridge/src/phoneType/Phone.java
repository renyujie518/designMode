package phoneType;

import phoneBrand.Brand;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName phoneType.Phone.java
 * @Description TODO
 * @createTime 2022年03月18日 15:19:00
 */
public abstract class Phone {
    //组合品牌
    private Brand brand;

    //构造器
    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    public void open() {
        brand.open();
    }
    public void close() {
        brand.close();
    }
    public void call() {
        brand.call();
    }

}
