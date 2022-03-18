package decorator2Coffee;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Decorator.java
 * @Description 装饰器包含被装饰者  (装饰器类Decorator和被包装类Coffee继承同样的父类Drink )
 * @createTime 2022年03月18日 17:38:00
 */
public class Decorator extends Drink {
    //组合
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    //继承抽象类后实现抽象方法  （需要增强的方法）
    @Override
    public float cost() {
        // getPrice 计算总价
        //这里做个解释：client中会利用多态： new Milk(Drink.class); 然后在Milk中给Drink的两个变量重新赋值
        //这里类似一个迭代的效果  新价格=新Drink（加的调料）+上一次被包装的价格
        return super.getPrice() + obj.cost();
    }

    //重写getDes方法  （需要增强的方法）
    @Override
    public String getDes() {
        // obj.getDes() 输出被装饰者的信息
        return super.des + " " + super.getPrice() + " && " + obj.getDes();
    }

}
