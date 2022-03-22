package jiedai.allStates;

import jiedai.StateEnum;
import jiedai.allStates.AbstractState;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName FeedBackState.java
 * @Description 具体的状态类  反馈
 * @createTime 2022年03月21日 23:15:00
 */
public class FeedBackState extends AbstractState {
    @Override
    public String getCurrentState() {
        return StateEnum.FEED_BACKED.getValue();
    }
}
