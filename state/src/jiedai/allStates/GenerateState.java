package jiedai.allStates;

import jiedai.Context;
import jiedai.StateEnum;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName GenerateState.java
 * @Description 具体的状态类  生成订单
 * @createTime 2022年03月21日 23:23:00
 */
public class GenerateState extends AbstractState {

    @Override
    public void checkEvent(Context context) {
        context.setState(new ReviewState());
    }

    @Override
    public void checkFailEvent(Context context) {
        context.setState(new FeedBackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.GENERATE.getValue();
    }

}
