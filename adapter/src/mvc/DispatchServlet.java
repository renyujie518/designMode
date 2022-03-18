package mvc;

import mvc.adapters.AnnotationHandlerAdapter;
import mvc.adapters.HandlerAdapter;
import mvc.adapters.HttpHandlerAdapter;
import mvc.adapters.SimpleHandlerAdapter;
import mvc.controllers.Controller;
import mvc.controllers.HttpController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName DispatchServlet.java
 * @Description 模仿DispatchServlet的功能
 * @createTime 2022年03月18日 14:32:00
 */
public class DispatchServlet {
    //list的类型是Adapter接口  由于各个adapters都实现了这个接口 多态
    public static List<HandlerAdapter> handlerAdapters = new ArrayList<HandlerAdapter>();

    public DispatchServlet() {
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }

    public void doDispatch() {

        // 此处模拟SpringMVC从request取handler的对象，
        // 适配器可以获取到希望的Controller
        HttpController controller = new HttpController();
        // AnnotationController controller = new AnnotationController();
        //SimpleController controller = new SimpleController();
        // 得到对应适配器
        HandlerAdapter adapter = getHandler(controller);
        // 通过适配器执行对应的controller对应方法
        adapter.handle(controller);

    }

    public HandlerAdapter getHandler(Controller controller) {
        //遍历：根据得到的controller(handler), 返回对应适配器
        for (HandlerAdapter adapter : handlerAdapters) {
            if (adapter.supports(controller)) {
                return adapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new DispatchServlet().doDispatch(); //这是http...
    }

}
