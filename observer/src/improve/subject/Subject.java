package improve.subject;


import improve.observer.Observer;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Subject.java
 * @Description 接口, 让WeatherData 来实现
 * @createTime 2022年03月20日 22:17:00
 */
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}
