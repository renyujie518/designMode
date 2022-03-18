/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Client.java
 * @Descriptio 做一个产品展示网站，客户要求都有些不同：
 * 1) 有客户要求以新闻的形式发布
 * 2) 有客户人要求以博客的形式发布
 * 3) 有客户希望以微信公众号的形式发布
 * @createTime 2022年03月18日 22:45:00
 */
public class Client {
    public static void main(String[] args) {

        // 创建一个工厂类
        WebSiteFactory factory = new WebSiteFactory();

        // 客户Tom要一个以新闻形式发布的网站
        WebSite webSite1 = factory.getWebSiteCategory("新闻");
        webSite1.use(new User("Tom"));

        // 客户Jack要一个以博客形式发布的网站
        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use(new User("Jack"));

        // 客户Smith要一个以博客形式发布的网站
        WebSite webSite3 = factory.getWebSiteCategory("博客");
        webSite3.use(new User("Smith"));

        System.out.println("网站的分类共=" + factory.getWebSiteCount());
    }

}
