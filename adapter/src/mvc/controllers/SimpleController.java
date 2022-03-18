package mvc.controllers;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName SimpleController.java
 * @Description TODO
 * @createTime 2022年03月18日 14:36:00
 */
public class SimpleController implements Controller {
    public void doSimplerHandler() {
        System.out.println("这是simple...");
    }
}
