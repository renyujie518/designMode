package bulider;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName HouseDirector.java
 * @Description Director（指挥者）： 构建一个使用Builder接口的对象。
 *  它主要是用于创建一个复杂的对象。它主要有两个作用，
 * 一是：隔离了客户与对象的生产过程，二是：负责控制产品对象的生产过程。
 * @createTime 2022年03月16日 21:35:00
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    //构造器传入 houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //通过setter 传入 houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程，交给指挥者
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }

}
