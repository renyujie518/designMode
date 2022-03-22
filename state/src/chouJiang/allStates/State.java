package chouJiang.allStates;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName State.java
 * @Description 定义出一个接口叫状态接口，每个状态都实现它。接口有扣除积分方法、抽奖方法、发放奖品方法
 * @createTime 2022年03月22日 13:26:00
 */
public abstract class State {
    // 扣除积分 - 50
    public abstract void deductMoney();

    // 是否抽中奖品
    public abstract boolean raffle();

    // 发放奖品(数量减少)
    public abstract  void dispensePrize();

}
