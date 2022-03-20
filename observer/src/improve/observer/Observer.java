package improve.observer;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Observer.java
 * @Description 订阅者接口
 * @createTime 2022年03月20日 22:20:00
 */
public interface Observer {
    public void update(float temperature, float pressure, float humidity);
}
