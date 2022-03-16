package classAdapter;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Voltage220V.java
 * @Description 被适配的类
 * @createTime 2022年03月16日 22:34:00
 */
public class Voltage220V {
    //输出220V的电压
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
