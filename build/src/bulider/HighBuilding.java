package bulider;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName HighBuilding.java
 * @Description 高楼 （具体建造者）： 实现接口，构建和装配各个部件。
 * @createTime 2022年03月16日 21:34:00
 */
public class HighBuilding extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println(" 高楼的打地基100米 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 高楼的砌墙20cm ");
    }

    @Override
    public void roofed() {
        System.out.println(" 高楼的透明屋顶 ");
    }

}
