package jiedai.allStates;

import jiedai.Context;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName stateClass.State.java
 * @Description 状态接口
 * @createTime 2022年03月21日 23:13:00
 */
public interface State {
    /**
     * 电审
     */
    void checkEvent(Context context);

    /**
     * 电审失败
     */
    void checkFailEvent(Context context);

    /**
     * 定价发布
     */
    void makePriceEvent(Context context);

    /**
     * 接单
     */
    void acceptOrderEvent(Context context);

    /**
     * 无人接单失效
     */
    void notPeopleAcceptEvent(Context context);

    /**
     * 付款
     */
    void payOrderEvent(Context context);

    /**
     * 接单有人支付失效
     */
    void orderFailureEvent(Context context);

    /**
     * 反馈
     */
    void feedBackEvent(Context context);

    String getCurrentState();

}
