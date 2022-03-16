package bulider;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName House.java
 * @Description 需要建房子：这一过程为打桩、砌墙、封顶。不管是普通房子也好，别墅也好都需要经历这些过程
 * @createTime 2022年03月16日 21:30:00
 */
public class House {
    private String baise;
    private String wall;
    private String roofed;


    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
