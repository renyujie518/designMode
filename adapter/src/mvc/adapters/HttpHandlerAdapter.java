package mvc.adapters;

import mvc.controllers.HttpController;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName HttpHandlerAdapter.java
 * @Description TODO
 * @createTime 2022年03月18日 14:41:00
 */
public class HttpHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handle(Object handler) {
        ((HttpController) handler).doHttpHandler();

    }
}
