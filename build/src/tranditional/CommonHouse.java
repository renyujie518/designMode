package tranditional;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName CommonHouse.java
 * @Description 普通房
 * @createTime 2022年03月16日 21:27:00
 */
public class CommonHouse extends AbstractHouse{
    @Override
    public void buildBasic() {
        System.out.println(" 普通房子打地基 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 普通房子砌墙 ");
    }

    @Override
    public void roofed() {
        System.out.println(" 普通房子封顶 ");
    }
}
