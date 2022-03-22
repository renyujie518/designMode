package jiedai.allStates;

import jiedai.Context;
import jiedai.StateEnum;
import jiedai.allStates.AbstractState;
import jiedai.allStates.FeedBackState;
import jiedai.allStates.NotPayState;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName PublishState.java
 * @Description 具体的状态类  发布
 * @createTime 2022年03月21日 23:24:00
 */
public class PublishState extends AbstractState {
    @Override
    public void acceptOrderEvent(Context context) {
        //把当前状态设置为  NotPayState
        //至于应该变成哪个状态，由流程图来决定
        context.setState(new NotPayState());
    }

    @Override
    public void notPeopleAcceptEvent(Context context) {
        context.setState(new FeedBackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.PUBLISHED.getValue();
    }

}
