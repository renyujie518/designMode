package chouJiang.allStates;

import chouJiang.RaffleActivity;
import chouJiang.allStates.State;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName NoRaffleState.java
 * @Description 不能抽奖状态
 * @createTime 2022年03月22日 13:27:00
 */
public class NoRaffleState extends State {
    // 初始化时传入活动引用，扣除积分后改变其状态
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    // 当前状态可以扣积分 , 扣除后，将状态设置成可以抽奖状态（状态流转）
    @Override
    public void deductMoney() {
        System.out.println("扣除50积分成功，您可以抽奖了");
        activity.setState(activity.getCanRaffleState());
    }

    // 当前状态不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖喔！");
        return false;
    }

    // 当前状态不能发奖品
    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }

}
