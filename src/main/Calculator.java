import java.math.BigDecimal;

/**
 * Created by Valerii Patsiorin on 15.03.2018.
 */
public class Calculator {
    private OperandStack values = new OperandStack();

    public BigDecimal getAccumulator() {
        return values.peek();
    }

    public void setAccumulator(BigDecimal value) {
        values.replaceTop(value);
    }

    public void enter() {
        values.push(getAccumulator());
    }

    public void drop() {
        values.pop();
    }

    public void execute(String op) {
        Operation operation = null;
        switch(op) {
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubtractOperation();
                break;
            default:
                throw new UnsupportedOperationException("Operation not supported");
        }
        operation.apply(values);
    }

    //TODO: add multiply, divide, unary operators and square
}
