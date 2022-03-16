package bulider;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName HouseBuilder.java
 * @Description 创建一个抽象类。对House对象的各个流程指定 接口/抽象类。
 *
 * @createTime 2022年03月16日 21:31:00
 */
public abstract class HouseBuilder {
    protected House house = new House();

    //将建造的流程写好, 抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    //建造房子好， 将产品(房子) 返回
    public House buildHouse() {
        return house;
    }

}
