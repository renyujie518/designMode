package jiedai;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName StateEnum.java
 * @Description TODO
 * @createTime 2022年03月21日 23:17:00
 */
public enum StateEnum {
    //订单生成
    GENERATE(1, "GENERATE"),

    //已审核
    REVIEWED(2, "REVIEWED"),

    //已发布
    PUBLISHED(3, "PUBLISHED"),

    //待付款
    NOT_PAY(4, "NOT_PAY"),

    //已付款
    PAID(5, "PAID"),

    //已完结
    FEED_BACKED(6, "FEED_BACKED");

    private int key;
    private String value;

    StateEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }
    public int getKey() {return key;}
    public String getValue() {return value;}

}
