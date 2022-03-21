import java.util.HashMap;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName SubExpression.java
 * @Description 减法解释器
 * @createTime 2022年03月21日 22:55:00
 */
public class SubExpression extends SymbolExpression{
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    //求出left 和 right 表达式相减后的结果
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }

}
