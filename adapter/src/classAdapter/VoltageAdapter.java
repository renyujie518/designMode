package classAdapter;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName VoltageAdapter.java
 * @Description 适配器
 * @createTime 2022年03月16日 22:36:00
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        //获取到220V电压
        int srcV = output220V();
        int dstV = srcV / 44 ; //转成 5v
        return dstV;
    }

}

