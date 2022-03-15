package lazy;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName lazy.singletonTest4.java
 * @Description 懒汉式(线程安全，同步方法)
 * 1) 解决了线程安全问题
 * 2) 效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。而其实这个方法只执行
 * 一次实例化代码就够了，后面的想获得该类实例，直接 return 就行了。方法进行同步效率太低
 * 3) 结论:在实际开发中，不推荐使用这种方式
 * @createTime 2022年03月15日 15:58:00
 */
public class singletonTest4 {
    public static void main(String[] args) {
        System.out.println("懒汉式 2 ， 线程安全~");
        Singleton4 instance1 = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("1实例的hash"+instance1);
        System.out.println("2实例的hash"+instance2);
    }

    static class Singleton4{
        private static Singleton4 instance;

        private Singleton4() {
        }

        //提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
        public static synchronized Singleton4 getInstance() {
            if (instance == null) {
                instance = new Singleton4();
            }
            return instance;
        }
    }
}
