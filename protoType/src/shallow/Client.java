package shallow;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Client.java
 * @Description 浅拷贝：两个对象的该成员变量（引用数据类型：某个数组、某个类的对象）都指向同一个实例（hash地址同，同一个空间）
 * 在一个对象中修改该成员变量会影响到另一个对象的该成员变量值
 * 比如在本例中  所有的sheep都是指向同一块内存地址XXX01 在浅拷贝的中途  我把这块内存中的数据改了
 * 那么所有的，包括在修改之前克隆的  都会被修改
 * @createTime 2022年03月16日 15:22:00
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("浅拷贝测试");
        Sheep sheep = new Sheep("tom", 1, "白色");

        sheep.friend = new Sheep("jack111", 2, "黑色");

        Sheep sheep2 = (Sheep)sheep.clone(); //克隆
        Sheep sheep3 = (Sheep)sheep.clone(); //克隆
        sheep3.friend.setName("jack222");
        Sheep sheep4 = (Sheep)sheep3.clone(); //克隆
        Sheep sheep5 = (Sheep)sheep3.clone(); //克隆

        System.out.println("sheep2 =" + sheep2 + "sheep2.friend=" + sheep2.friend + sheep2.friend.hashCode());
        System.out.println("sheep3 =" + sheep3 + "sheep3.friend=" + sheep3.friend + sheep3.friend.hashCode());
        System.out.println("sheep4 =" + sheep4 + "sheep4.friend=" + sheep4.friend + sheep4.friend.hashCode());
        System.out.println("sheep5 =" + sheep5 + "sheep5.friend=" + sheep5.friend + sheep5.friend.hashCode());
    }

}
