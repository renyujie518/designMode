package tranditional;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Client.java
 * @Description 传统方式解决盖房需求问题分析
 * 1) 优点是比较好理解，简单易操作。
 * 2) 设计的程序结构，过于简单，没有设计缓存层对象，程序的扩展和维护不好.
 * 也就是说，这种设计方案，把产品(即：房子) 和 创建产品的过程(即：建房子流程) 封装在一起，耦合性增强了。
 * 3) 解决方案：将产品和产品建造过程解耦 => 建造者模式.
 * @createTime 2022年03月16日 21:28:00
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}

