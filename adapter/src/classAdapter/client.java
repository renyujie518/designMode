package classAdapter;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName classAdapter.java
 * @Description 使用
 * @createTime 2022年03月16日 22:37:00
 */
public class client {
    public static void main(String[] args) {
        System.out.println(" === 类适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
