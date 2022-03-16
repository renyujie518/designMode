package objectAdapter;

import classAdapter.Phone;
import classAdapter.Voltage220V;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName client.java
 * @Description 使用
 * @createTime 2022年03月16日 22:42:00
 */
public class client {
    public static void main(String[] args) {
        System.out.println(" === 对象适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
