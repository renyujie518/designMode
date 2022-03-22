package jiedai.allStates;

import jiedai.Context;
import jiedai.StateEnum;
import jiedai.allStates.AbstractState;
import jiedai.allStates.PublishState;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName ReviewState.java
 * @Description 具体的状态类  审核
 * @createTime 2022年03月21日 23:25:00
 */
public class ReviewState extends AbstractState {
    @Override
    public void makePriceEvent(Context context) {
        context.setState(new PublishState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.REVIEWED.getValue();
    }


}
