package bulider;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName CommonHouse.java
 * @Description 普通房 （具体建造者）： 实现接口，构建和装配各个部件。
 * @createTime 2022年03月16日 21:33:00
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println(" 普通房子打地基5米 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 普通房子砌墙10cm ");
    }

    @Override
    public void roofed() {

        System.out.println(" 普通房子屋顶 ");
    }

}
