package hungry;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName hungry.singletonTest2.java
 * @Description 饿汉式(静态代码块)
 * 1) 这种方式和1的方式其实类似，
 * 只不过将类实例化的过程放在了静态代码块中，也是在类装载的时候，就执 行
 * 静态代码块中的代码，初始化类的实例。优缺点和1是一样的。
 * 2) 结论:这种单例模式可用，但是可能造成内存浪费
 * @createTime 2022年03月15日 15:43:00
 */
public class singletonTest2 {
    public static void main(String[] args) {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("1实例的hash"+instance1);
        System.out.println("2实例的hash"+instance2);

    }

    static class Singleton2{
        //1. 构造器私有化, 外部能 new
        private Singleton2() {
        }
        //2.本类内部创建对象实例
        private static Singleton2 instance;

        // 在静态代码块中，创建单例对象
        static {
            instance = new Singleton2();
        }
        //3. 提供一个公有的静态方法，返回实例对象
         public static Singleton2 getInstance() {
            return instance;
        }
    }

}
