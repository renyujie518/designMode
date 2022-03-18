package decorator2Coffee;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName decorator2Coffee.Drink.java
 * @Description 饮料的抽象类
 * @createTime 2022年03月18日 17:36:00
 */
public abstract class Drink {

    public String des; // 描述
    private float price = 0.0f;

    @Override
    public String toString() {
        return "Drink{" +
                "des='" + des + '\'' +
                ", price=" + price +
                '}';
    }

    public String getDes() {
        return des;
    }
    public void setDes(String des) {
        this.des = des;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    //计算费用的抽象方法
    //子类来实现
    public abstract float cost();

}