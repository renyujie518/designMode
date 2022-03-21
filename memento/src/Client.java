/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Client.java
 * @Description
 * 游戏角色有攻击力和防御力，在大战Boss前保存自身的态(攻击力和防御力)，当大战Boss后攻击力和防御力
 * 下降，从备忘录对象恢复到大战前的状态
 *
 * 原理：
 * 1) 备忘录模式（Memento Pattern）在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
 * 这样以后就可将该对象恢复到原先保存的状态
 * 2) 可以这里理解备忘录模式：现实生活中的备忘录是用来记录某些要去做的事情，或者是记录已经达成的共同意见的事情，
 * 以防忘记了。而在软件层面，备忘录模式有着相同的含义，备忘录对象主要用来记录一个对象的某种状态，或者某些
 * 数据，当要做回退时，可以从备忘录对象里获取原来的数据进行恢复操作
 * 3) 备忘录模式属于行为型模式
 *
 * 优缺点：
 * 1) 给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态
 * 2) 实现了信息的封装，使得用户不需要关心状态的保存细节
 * 3) 如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存, 这个需要注意
 * 4) 适用的应用场景：
 * 1、后悔药。 2、打游戏时的存档。 3、Windows 里的 ctri + z。4、IE 中的后退。 4、数据库的事务管理
 * 5) 为了节约内存，备忘录模式可以和原型模式配合使用
 * @createTime 2022年03月21日 22:19:00
 */
public class Client {
    public static void main(String[] args) {
        //创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);

        System.out.println("大战前的状态");
        gameRole.display();

        //把当前状态保存caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.add(gameRole.createMemento());

        System.out.println("和boss1大战~~~");
        gameRole.setDef(50);
        gameRole.setVit(50);
        gameRole.display();
        //把当前状态保存caretaker
        caretaker.add(gameRole.createMemento());

        System.out.println("和boss2大战~~~");
        gameRole.setDef(30);
        gameRole.setVit(30);
        gameRole.display();
        //把当前状态保存caretaker
        caretaker.add(gameRole.createMemento());


        System.out.println("大战后，使用备忘录对象恢复到大战boss2前");
        gameRole.recoverGameRoleFromMemento(caretaker.get(1));
        gameRole.display();

        System.out.println("大战后，使用备忘录对象恢复到大战boss1前");
        gameRole.recoverGameRoleFromMemento(caretaker.get(0));
        gameRole.display();
    }


}
