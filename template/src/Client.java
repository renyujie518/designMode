/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Client.java
 * @Description 编写制作豆浆的程序，说明如下:
 * 1) 制作豆浆的流程 选材--->添加配料--->浸泡--->放到豆浆机打碎
 * 2) 通过添加不同的配料，可以制作出不同口味的豆浆
 * 3) 选材、浸泡和放到豆浆机打碎这几个步骤对于制作每种口味的豆浆都是一样的
 * 4) 请使用 模板方法模式 完成 (说明：因为模板方法模式，比较简单，很容易就想到这个方案，因此就直接使用，不再使用传统的
 * 方案来引出模板方法模式 )
 * @createTime 2022年03月19日 19:19:00
 */
public class Client {
    public static void main(String[] args) {

        //制作红豆豆浆

        System.out.println("----制作红豆豆浆----");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("----制作花生豆浆----");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
    }

}
