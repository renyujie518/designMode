package mvc.adapters;

import mvc.controllers.SimpleController;


/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName SimpleHandlerAdapter.java
 * @Description TODO
 * @createTime 2022年03月18日 14:35:00
 */
public class SimpleHandlerAdapter implements HandlerAdapter {


    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

    @Override
    public void handle(Object handler) {
        ((SimpleController) handler).doSimplerHandler();
    }
}
