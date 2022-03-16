/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Client.java
 * @Description 现在有一只羊tom，姓名为: tom, 年龄为：1，颜色为：白色，请编写程序创建和tom羊属性完全相同的10只羊。
 * 注意  只是属性相同  并不是同一个对象
 *
 * 原型模式的注意事项和细节
 * 1) 创建新的对象比较复杂时，可以利用原型模式简化对象的创建过程，同时也能够提高效率
 * 2) 不用重新初始化对象，而是动态地获得对象运行时的状态
 * 3) 如果原始对象发生变化(增加或者减少属性)，其它克隆对象的也会发生相应的变化，无需修改代码（浅拷贝的时候）
 * 4) 在实现深克隆的时候可能需要比较复杂的代码
 * 5) 缺点：需要为每一个类配备一个克隆方法，这对全新的类来说不是很难，但对已有的类进行改造时，需要修改其源代码，违背了ocp原则
 * @createTime 2022年03月16日 14:52:00
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("原型模式完成对象的创建");
        Sheep sheep = new Sheep("tom", 1, "白色");

        Sheep sheep2 = (Sheep)sheep.clone(); //克隆
        Sheep sheep3 = (Sheep)sheep.clone(); //克隆
        Sheep sheep4 = (Sheep)sheep.clone(); //克隆
        Sheep sheep5 = (Sheep)sheep.clone(); //克隆
        Sheep sheep6 = (Sheep) sheep.clone();//克隆
        //.....

        System.out.println("sheep2 =" + sheep2);
        System.out.println("sheep3 =" + sheep3);
        System.out.println("sheep4 =" + sheep4);
        System.out.println("sheep5 =" + sheep5);
    }
}
