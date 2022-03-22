package jiedai.allStates;

import jiedai.Context;
import jiedai.StateEnum;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName NotPayState.java
 * @Description 具体的状态类  未支付
 * @createTime 2022年03月21日 23:23:00
 */
public class NotPayState extends AbstractState {
    @Override
    public void payOrderEvent(Context context) {
        context.setState(new PaidState());
    }

    @Override
    public void feedBackEvent(Context context) {
        context.setState(new FeedBackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.NOT_PAY.getValue();
    }

}
