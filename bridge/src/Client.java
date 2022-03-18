import phoneBrand.Vivo;
import phoneBrand.XiaoMi;
import phoneType.FoldedPhone;
import phoneType.Phone;
import phoneType.UpRightPhone;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Client.java
 * @Description TODO
 * @createTime 2022年03月18日 15:27:00
 */
public class Client {
    public static void main(String[] args) {

        //获取折叠式手机 (样式 + 品牌 )

        Phone xiaoMiZheDie = new FoldedPhone(new XiaoMi());

        xiaoMiZheDie.open();
        xiaoMiZheDie.call();
        xiaoMiZheDie.close();

        System.out.println("==============");

        Phone vivoZheDie = new FoldedPhone(new Vivo());

        vivoZheDie.open();
        vivoZheDie.call();
        vivoZheDie.close();

        System.out.println("==============");

        UpRightPhone xiaomiZhiLi = new UpRightPhone(new XiaoMi());

        xiaomiZhiLi.open();
        xiaomiZhiLi.call();
        xiaomiZhiLi.close();

        System.out.println("==============");

        UpRightPhone vivoZhiLi = new UpRightPhone(new Vivo());

        vivoZhiLi.open();
        vivoZhiLi.call();
        vivoZhiLi.close();
    }
}
