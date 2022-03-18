package mvc.adapters;

import mvc.controllers.AnnotationController;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName AnnotationHandlerAdapter.java
 * @Description TODO
 * @createTime 2022年03月18日 14:39:00
 */
public class AnnotationHandlerAdapter implements HandlerAdapter {

    @Override
    public void handle(Object handler) {
        ((AnnotationController) handler).doAnnotationHandler();
    }

    @Override
    public boolean supports(Object handler) {

        return (handler instanceof AnnotationController);
    }

}

