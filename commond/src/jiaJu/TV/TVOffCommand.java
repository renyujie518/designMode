package jiaJu.TV;

import jiaJu.Command;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName TVOffCommand.java
 * @Description 电视关闭命令  不直接重写Command接口的函数  而是通过receiver（纽带桥梁）执行具体的方法
 * @createTime 2022年03月20日 14:33:00
 */
public class TVOffCommand implements Command {
    // 聚合TVReceiver

    TVReceiver tv;

    // 构造器
    public TVOffCommand(TVReceiver tv) {
        super();
        this.tv = tv;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        tv.off();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        tv.on();
    }

}
