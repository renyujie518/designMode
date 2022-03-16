package deep;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Client.java
 * @Description 可以看到  经过两种方式处理后的 首先基本类型（本次实验室String）name这个属性都是直接值拷贝的
 * 对于引用类型（本次实验是DeepCloneableTarget）这个属性 与被拷贝的对象p1的内存地址是不一样的  即做到了对引用类型的深拷贝
 * 同时 由于是深拷贝 在拷贝途中忽然原对象变化了，拷贝的是变化之后的情况（而浅拷贝中针对引用类型的属性则失效，详见shallow.Client）
 * @createTime 2022年03月16日 15:38:00
 */
public class Client {
    public static void main(String[] args) throws Exception {
        DeepProtoType p1 = new DeepProtoType();
        p1.name = "汽车";
        p1.deepCloneableTarget = new DeepCloneableTarget("轿车", "公交车");

        //方式1 完成深拷贝

		DeepProtoType p2 = (DeepProtoType) p1.clone();

        System.out.println("p1.name=" + p1.name + " p1.deepCloneableTarget=" + p1.deepCloneableTarget.toString() + p1.deepCloneableTarget.hashCode());
        System.out.println("p2.name=" + p2.name + " p2.deepCloneableTarget=" + p2.deepCloneableTarget.toString() + p2.deepCloneableTarget.hashCode());

        //方式2 完成深拷贝
        p1.name = "轮船";
        p1.deepCloneableTarget = new DeepCloneableTarget("游轮", "驱逐舰");
        DeepProtoType p3 = (DeepProtoType) p1.deepClone();
        System.out.println("p1.name=" + p1.name + " p1.deepCloneableTarget=" + p1.deepCloneableTarget.toString() + p1.deepCloneableTarget.hashCode());
        System.out.println("p3.name=" + p3.name + " p3.deepCloneableTarget=" + p3.deepCloneableTarget.toString() + p3.deepCloneableTarget.hashCode());

    }
}
