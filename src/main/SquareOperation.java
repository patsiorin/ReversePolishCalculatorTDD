import java.math.BigDecimal;

/**
 * Created by Valerii Patsiorin on 16.03.2018.
 */
public class SquareOperation implements Operation {
    @Override
    public void apply(OperandStack values) {
        BigDecimal value = values.peek();
        BigDecimal sqrValue = value.pow(2);
        values.replaceTop(sqrValue);
    }
}
