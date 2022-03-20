package jiaJu.Light;

import jiaJu.Command;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName jiaJu.Light.LightOffCommand.java
 * @Description 电灯关闭命令 不直接重写Command接口的函数  而是通过receiver（纽带桥梁）执行具体的方法
 * @createTime 2022年03月20日 14:28:00
 */
public class LightOffCommand implements Command {
    //聚合LightReceiver
    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        light.off();

    }

    @Override
    public void undo() {
        // 调用接收者的方法
        light.on();
    }
}
