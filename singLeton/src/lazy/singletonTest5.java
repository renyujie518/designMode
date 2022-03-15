package lazy;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName lazy.singletonTest5.java
 * @Description 懒汉式(线程安全，同步代码块)
 * 同4一样  开发不推荐使用
 * @createTime 2022年03月15日 16:02:00
 */
public class singletonTest5 {
    public static void main(String[] args) {
        System.out.println("懒汉式 2 ， 线程安全~");
        Singleton5 instance1 = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("1实例的hash"+instance1);
        System.out.println("2实例的hash"+instance2);
    }

    static class Singleton5{
        private static Singleton5 instance;

        private Singleton5() {
        }

        //同步代码块解决线程安全问题
        public static  Singleton5 getInstance() {
            if (instance == null) {
                synchronized (Singleton5.class) {
                    instance = new Singleton5();
                }
            }
            return instance;
        }
    }
}
