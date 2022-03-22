package jiedai;

import jiedai.allStates.PublishState;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName client.java
 * @Description
 * 状态模式优缺点：
 * 1) 代码有很强的可读性。状态模式将每个状态的行为封装到对应的一个类中
 * 2) 方便维护。将容易产生问题的if-else语句删除了，如果把每个状态的行为都放到一个类中，每次调用方法时都要判断当前是什
 *     么状态，不但会产出很多if-else语句，而且容易出错
 * 3) 符合“开闭原则”。容易增删状态
 * 4) 会产生很多类。每个状态都要一个对应的类，当状态过多会产生很多类，加大维护难度
 * 5) 应用场景：当一个事件或者对象有很多种状态，状态之间会相互转换，对不同的状态要求有不同的行为的时候，可
 *    以考虑使用状态模式
 * @createTime 2022年03月21日 23:26:00
 */
public class client {
    public static void main(String[] args) {
        //创建context 对象
        Context context = new Context();
        //将当前状态设置为 PublishState(初始化)
        context.setState(new PublishState());

        //流程开始运转
        //publish --> not pay
        context.acceptOrderEvent(context);
        //not pay --> paid
        context.payOrderEvent(context);
        // 失败, 检测失败时，会抛出异常
        try {
        	context.checkFailEvent(context);
        	System.out.println("流程正常..");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

    }

}
