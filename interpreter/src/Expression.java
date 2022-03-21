import java.util.HashMap;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName Expression.java
 * @Description 抽象类表达式，通过HashMap 键值对, 可以获取到变量的值
 * @createTime 2022年03月21日 22:47:00
 */
public abstract class Expression {
    // a + b - c
    // 解释公式和数值, key 就是公式(表达式) 参数[a,b,c], value就是就是具体值
    public abstract int interpreter(HashMap<String, Integer> var);

}
