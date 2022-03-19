import java.util.HashMap;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName WebSiteFactory.java
 * @Description 网站工厂类，根据需要返回一个网站
 * 1) 在享元模式这样理解，“享”就表示共享，“元”表示对象
 * 2) 系统中有大量对象，这些对象消耗大量内存，并且对象的状态大部分可以外部化时，我们就可以考虑选用享元模式
 * 3) 用唯一标识码判断，如果在内存中有，则返回这个唯一标识码所标识的对象，用HashMap/HashTable存储
 * 4) 享元模式大大减少了对象的创建，降低了程序内存的占用，提高效率
 * 5) 享元模式提高了系统的复杂度。需要分离出内部状态和外部状态，而外部状态具有固化特性，不应该随着内部状态的改
 *    变而改变，这是我们使用享元模式需要注意的地方.
 * 6) 使用享元模式时，注意划分内部状态和外部状态，并且需要有一个工厂类加以控制。
 * 7) 享元模式经典的应用场景是需要缓冲池的场景，
 * 比如 String常量池、数据库连接池
 *
 * 内部状态指对象共享出来的信息，存储在享元对象内部且不会随环境的改变而改变
 * 外部状态指对象得以依赖的一个标记，是随环境改变而改变的、不可共享的状态。
 * @createTime 2022年03月18日 22:44:00
 */
public class WebSiteFactory {

    //集合， 充当池的作用
    //不可变对象不能暴露任何 set() 等修改内部状态的方法。
    // 之所以要求享元是不可变对象，那是因为它会被多处代码共享使用，避免一处代码对享元进行了修改，影响到其他使用它的代码。
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    //根据网站的类型，返回一个网站, 如果没有就创建一个网站，并放入到池中,并返回
    public WebSite getWebSiteCategory(String type) {
        if(!pool.containsKey(type)) {
            //就创建一个网站，并放入到池中
            pool.put(type, new ConcreteWebSite(type));
        }

        return (WebSite)pool.get(type);
    }

    //获取网站分类的总数 (池中有多少个网站类型)
    public int getWebSiteCount() {
        return pool.size();
    }

}
