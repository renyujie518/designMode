package jiaJu;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName jiaJu.Command.java
 * @Description 创建命令接口
 * @createTime 2022年03月20日 14:25:00
 */
public interface Command {
    //执行动作(操作)
    void execute();
    //撤销动作(操作)
    void undo();
}
