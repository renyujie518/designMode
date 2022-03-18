package mvc.adapters;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName HandlerAdapter.java
 * @Description TODO
 * @createTime 2022年03月18日 14:33:00
 */
public interface HandlerAdapter {
    public boolean supports(Object handler);

    public void handle(Object handler);

}
