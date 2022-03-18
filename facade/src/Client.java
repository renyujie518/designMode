/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Client.java
 * @Description 外观模式可以理解为转换一群接口，客户只要调用一个接口，而不用调用多个接口才能达到目的
 * @createTime 2022年03月18日 22:11:00
 */
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.end();
    }
}
