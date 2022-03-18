/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Client.java
 * @Description 展示一个学校院系结构：需求是这样，要在一个页面中展示出学校的院系组成，一个学校有多个学院，一个学院有多个系。
 * @createTime 2022年03月18日 20:59:00
 */
public class Client {
    public static void main(String[] args) {

        //从大到小创建对象 学校
        OrganizationComponent university = new University("中国科学院大学", " 中国顶级大学 ");

        //创建 学院
        OrganizationComponent computerCollege = new College("计算机学院", " 计算机学院 ");
        OrganizationComponent infoEngineercollege = new College("信息工程学院", " 信息工程学院 ");


        //创建各个学院下面的系
        computerCollege.add(new Department("软件工程", " 软件工程专业 "));
        computerCollege.add(new Department("网络工程", " 网络工程专业 "));
        computerCollege.add(new Department("计算机科学与技术", " 计算机科学与技术专业 "));


        infoEngineercollege.add(new Department("通信工程", " 通信工程专业 "));
        infoEngineercollege.add(new Department("信息工程", " 信息工程专业 "));

        //将学院加入到 学校
        university.add(computerCollege);
        university.add(infoEngineercollege);

        university.print();
        //infoEngineercollege.print();
    }

}
