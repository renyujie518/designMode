/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName singletonTest6.java
 * @Description 双重检查
 * 1) Double-Check 概念是多线程开发中常使用到的，
 *    如代码中所示，我们进行了两次 if (singleton == null)检查，这 样就可以保证线程安全了。
 * 2) 这样，实例化代码只用执行一次，后面再次访问时，判断if(singleton!=null)，直接return实例化对象，
 *    也避 免的反复进行方法同步.
 * 3) 线程安全;延迟加载;效率较高
 * 4) 结论:在实际开发中，推荐使用这种单例设计模式
 * @createTime 2022年03月15日 16:15:00
 */
public class singletonTest6 {
    public static void main(String[] args) {
        System.out.println("双重检查");
        Singleton6 instance1 = Singleton6.getInstance();
        Singleton6 instance2 = Singleton6.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("1实例的hash"+instance1);
        System.out.println("2实例的hash"+instance2);

    }

    static class Singleton6{
        private static volatile Singleton6 instance;

        private Singleton6() {
        }

        public static synchronized Singleton6 getInstance() {
            if(instance == null) {
                synchronized (Singleton6.class) {
                    if(instance == null) {
                        instance = new Singleton6();
                    }
            }
        }
            return instance;
        }
    }
}
