package jiaJu;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName jiaJu.RemoteController.java
 * @Description 模拟遥控器
 * @createTime 2022年03月20日 14:30:00
 */
public class RemoteController {
    // 开/关按钮的命令数组
    Command[] onCommands;
    Command[] offCommands;

    // 执行撤销的命令（相当于遥控器上撤销只有一个键）用于记录是哪个no操作了撤销
    Command undoCommand;

    // 构造器，完成对按钮初始化
    public RemoteController() {

        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    // 给我们的按钮设置你需要的命令
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    // 按下开按钮
    public void onButtonWasPushed(int no) {
        // 找到你按下的开的按钮， 并调用对应方法
        onCommands[no].execute();
        // 记录这次的操作，用于撤销
        undoCommand = onCommands[no];

    }

    // 按下关按钮
    public void offButtonWasPushed(int no) {
        // 找到你按下的关的按钮， 并调用对应方法
        offCommands[no].execute();
        // 记录这次的操作，用于撤销
        undoCommand = offCommands[no];

    }

    // 按下撤销按钮（只能撤销一次）
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
