package coffee;

import decorator2Coffee.Drink;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Coffee.java
 * @Description 饮料的子类  相当于缓冲层
 *缓冲层作用：装饰器类Decorator只需要实现它需要增强的方法就可以了，其他方法继承装饰器父类的默认实现。
 * (装饰器类Decorator和被包装类Coffee继承同样的父类Drink )
 *
 *
 * @createTime 2022年03月18日 17:41:00
 */
public class Coffee extends Drink {

    //饮料的子类实现方法（返回父类Drink的价格）继承装饰器父类的默认实现
    @Override
    public float cost() {
        return super.getPrice();
    }
}
