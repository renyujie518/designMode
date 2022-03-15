package lazy;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName lazy.singletonTest3.java
 * @Description 懒汉式(线程不安全)
 *
 * 1) 起到了LazyLoading的效果，但是只能在单线程下使用。
 * 2) 如果在多线程下，一个线程进入了if(singleton==null)判断语句块，还未来得及往下执行，另一个线程也通过
 * 了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式
 * 3) 结论:在实际开发中，不要使用这种方式.
 * @createTime 2022年03月15日 15:53:00
 */
public class singletonTest3 {
    public static void main(String[] args) {
        System.out.println("懒汉式 1 ， 线程不安全~");
        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("1实例的hash"+instance1);
        System.out.println("2实例的hash"+instance2);

    }
    static class Singleton3{
        private static Singleton3 instance;

        private Singleton3() {
        }

        //提供一个静态的公有方法，当使用到该方法时，才去创建 instance 即懒汉式
        public static Singleton3 getInstance() {
            if (instance == null) {
                instance = new Singleton3();
            }
            return instance;
        }
    }
}
