import java.math.BigDecimal;

/**
 * Created by Valerii Patsiorin on 15.03.2018.
 */
public abstract class BinaryOperation implements Operation {
    public void apply(OperandStack values) {
        BigDecimal value1 = values.peek();
        values.pop();
        BigDecimal value2 = values.peek();
        values.pop();
        values.replaceTop(calculate(value1, value2));
    }

    protected abstract BigDecimal calculate(BigDecimal value1, BigDecimal value2);
}
