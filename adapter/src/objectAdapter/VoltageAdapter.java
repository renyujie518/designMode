package objectAdapter;

import classAdapter.IVoltage5V;
import classAdapter.Voltage220V;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName VoltageAdapter.java
 * @Description 基本思路和类的适配器模式相同，只是将 Adapter 类作修改
 * 不是继承 src 类，而是持有 src 类的实例，以解决 兼容性的问题。
 * 即：持有 src 类，实现 dst 类接口，完成 src->dst 的适配 ，在系统中尽量使用关联关系（聚合，组合）来替代继承关系。
 * @createTime 2022年03月16日 22:40:00
 */
public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V; // 关联关系-聚合

    // 通过构造器，传入一个 Voltage220V 实例
    public VoltageAdapter(Voltage220V voltage220v) {

        this.voltage220V = voltage220v;
    }

    @Override
    public int output5V() {

        int dst = 0;
        if (null != voltage220V) {
            int src = voltage220V.output220V(); // 获取220V 电压
            System.out.println("使用对象适配器，进行适配~~");
            dst = src / 44;
            System.out.println("适配完成，输出的电压为=" + dst);
        }

        return dst;
    }
}
