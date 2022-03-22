package jiedai.allStates;

import jiedai.Context;
import jiedai.StateEnum;
import jiedai.allStates.AbstractState;
import jiedai.allStates.FeedBackState;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName PaidState.java
 * @Description 具体的状态类  已支付
 * @createTime 2022年03月21日 23:24:00
 */
public class PaidState extends AbstractState {
    @Override
    public void feedBackEvent(Context context) {
        context.setState(new FeedBackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.PAID.getValue();
    }

}
