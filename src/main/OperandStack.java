import java.math.BigDecimal;
import java.util.Stack;

/**
 * Created by Valerii Patsiorin on 15.03.2018.
 */
public class OperandStack {
    private Stack<BigDecimal> values = new Stack<>();

    public BigDecimal peek() {
        if (values.size() == 0)
            return BigDecimal.ZERO;
        return values.peek();
    }

    public void push(BigDecimal value) {
        values.push(value);
    }

    public void replaceTop(BigDecimal value) {
        pop();
        push(value);
    }

    public void pop() {
        if (values.size() > 0)
            values.pop();
    }
}
