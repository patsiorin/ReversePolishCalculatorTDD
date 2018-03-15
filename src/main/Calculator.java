import java.math.BigDecimal;
import java.util.Stack;

/**
 * Created by Valerii Patsiorin on 15.03.2018.
 */
public class Calculator {
    private Stack<BigDecimal> values = new Stack();
    private BigDecimal accumulator = BigDecimal.ZERO;

    public BigDecimal getAccumulator() {
        if (values.size() == 0)
            return BigDecimal.ZERO;
        return values.peek();
    }

    public void setAccumulator(BigDecimal accumulator) {
        if (values.size() > 0)
            values.pop();
        values.push(accumulator);
    }

    public void enter() {
        values.push(getAccumulator());

    }

    public void drop() {
        values.pop();
    }
}
