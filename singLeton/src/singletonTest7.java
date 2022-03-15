/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName singletonTest7.java
 * @Description 静态内部类
1) 这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
2) 静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时即调用getInstance方法时
才会装载 SingletonInstance 类，从而完成 Singleton 的实例化。
3) 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行
初始化时，别的线程是无法进入的。
4) 优点:避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
5) 结论:推荐使用.

 * @createTime 2022年03月15日 16:20:00
 */
public class singletonTest7 {
    public static void main(String[] args) {
        System.out.println("使用静态内部类完成单例模式");
        Singleton7 instance1 = Singleton7.getInstance();
        Singleton7 instance2 = Singleton7.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("1实例的hash"+instance1);
        System.out.println("2实例的hash"+instance2);
    }


    static class Singleton7{

        private Singleton7() {
        }

        //写一个静态内部类,该类中有一个静态属性 Singleton  final底层有优化
        private static class  SingletonInstance {
            private static final Singleton7 INSTANCE = new Singleton7();
        }
        //提供一个静态的公有方法，直接返回 SingletonInstance.INSTANCE
        public static  Singleton7 getInstance() {
            return SingletonInstance.INSTANCE;
        }
    }
}
