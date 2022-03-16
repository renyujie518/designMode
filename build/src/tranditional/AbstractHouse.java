package tranditional;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName AbstractHouse.java
 * @Description 盖房项目需求
 * 1) 需要建房子：这一过程为打桩、砌墙、封顶
 * 2) 房子有各种各样的，比如普通房，高楼，别墅，各种房子的过程虽然一样，但是要求不要相同的.
 * @createTime 2022年03月16日 21:26:00
 */
public abstract class AbstractHouse {
    //打地基
    public abstract void buildBasic();
    //砌墙
    public abstract void buildWalls();
    //封顶
    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }

}
