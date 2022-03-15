/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName singletonTest8.java
 * @Description 枚举实现单例
 * 1) 这借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建 新的对象。
 * 2) 这种方式是EffectiveJava作者JoshBloch提倡的方式
 * 3) 结论:推荐使用
 * @createTime 2022年03月15日 16:29:00
 */
public class singletonTest8 {
    public static void main(String[] args) {
        Singleton7 instance1 = Singleton7.INSTANCE;
        Singleton7 instance2 = Singleton7.INSTANCE;
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        instance1.sayOk();
        instance2.sayOk();
    }

    enum Singleton7{
        INSTANCE;
        public  void sayOk() {
            System.out.println("ok");
        }
    }
}
