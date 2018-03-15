import java.math.BigDecimal;

/**
 * Created by Valerii Patsiorin on 15.03.2018.
 */
public class AddOperation extends BinaryOperation {
    @Override
    protected BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
        return value2.add(value1);
    }
}
