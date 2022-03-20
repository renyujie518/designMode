package jiaJu;

import jiaJu.Command;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName jiaJu.NoCommand.java
 * @Description 空命令  主要简化操作 省去了判空的操作。
 * 如果没有用空命令，我们每按下一个按键都要判空
 * @createTime 2022年03月20日 14:29:00
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
