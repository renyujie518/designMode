import Action.Fail;
import Action.Success;
import Action.Wait;
import Person.Man;
import Person.Woman;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Client.java
 * @Description
 *
 * 将人分为男人和女人，对歌手进行测评，当看完某个歌手表演后，得到他们对该歌手不同的评价(评价有不同的种类，比如成功、失败等)，
 *访问者模式的注意事项和细节：
 *  优点
 * 1) 访问者模式符合单一职责原则、让程序具有优秀的扩展性、灵活性非常高
 * 2) 访问者模式可以对功能进行统一，可以做报表、UI、拦截器与过滤器，适用于数据结构相对稳定的系统
 *  缺点
 * 1) 具体元素对访问者公布细节，也就是说访问者关注了其他类的内部细节，这是迪米
 *    特法则所不建议的, 这样造成了具体元素变更比较困难
 * 2) 违背了依赖倒转原则。访问者依赖的是具体元素，而不是抽象元素
 * 3) 因此，如果一个系统有比较稳定的数据结构，又有经常变化的功能需求，那么访问者模式就是比较合适的.
 *
 * 上面提到了双分派，所谓双分派是指不管类怎么变化，我们都能找到期望的方法运行。
 * 双分派意味着得到执行的操作取决于请求的种类和两个接收者的类型
 * 以上述实例为例，假设我们要添加一个Wait的状态类，考察Man类和Woman类的反应，由于使用了双分派，只需增加一
 * 个Action子类即可在客户端调用即可，不需要改动任何其他类的代码。
 * @createTime 2022年03月20日 16:30:00
 */
public class Client {
    public static void main(String[] args) {

        //创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());


        //把Action放进去
        System.out.println("=======给的是成功的测评========");
        Success success = new Success();
        objectStructure.display(success);

        System.out.println("=======给的是失败的测评========");
        Fail fail = new Fail();
        objectStructure.display(fail);

        System.out.println("=======给的是待定的测评========");
        Wait wait = new Wait();
        objectStructure.display(wait);
    }

}
