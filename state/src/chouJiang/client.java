package chouJiang;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName client.java
 * @Description
 * 1) 假如每参加一次这个活动要扣除用户50积分，中奖概率是10%
 * 2) 奖品数量固定，抽完就不能抽奖
 * 3) 活动有四个状态: 可以抽奖、不能抽奖、发放奖品和奖品领完
 *
 * 1) 状态模式（State Pattern）：它主要用来解决对象在多种状态转换时，需要对外输出不同的行为的问题。
 * 状态和行为是一一对应的，状态之间可以相互转换
 * 2) 当一个对象的内在状态改变时，允许改变其行为，这个对象看起来像是改变了其类
 * @createTime 2022年03月22日 13:32:00
 */
public class client {
    public static void main(String[] args) {
        // 创建活动对象，奖品有1个奖品
        RaffleActivity activity = new RaffleActivity(1);

        // 我们连续抽300次奖
        for (int i = 0; i < 30; i++) {
            System.out.println("--------第" + (i + 1) + "次抽奖----------");
            // 参加抽奖，第一步点击扣除积分
            activity.debuctMoney();

            // 第二步抽奖
            activity.raffle();
        }
    }
}
