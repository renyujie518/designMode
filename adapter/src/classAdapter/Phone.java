package classAdapter;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Phone.java
 * @Description 适配接口当参数传入
 * @createTime 2022年03月16日 22:35:00
 */
public class Phone {
    //充电
    public void charging(IVoltage5V iVoltage5V) {
        if(iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V, 可以充电~~");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于5V, 不能充电~~");
        }
    }
}
