package Person;

import Action.Action;


/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Person.Man.java
 * @Description
 *  1. 这里我们使用到了双分派, 即首先在客户端程序中，将具体状态作为参数传递Man中(第一次分派)
 *  2. 然后Man类调用作为参数的 "具体方法" 中方法getManResult, 同时将自己(this)作为参数
 *     传入，完成第二次的分派(解耦)
 * @createTime 2022年03月20日 16:26:00
 */
public class Man extends Person {

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
