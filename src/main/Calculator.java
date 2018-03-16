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
        Operation operation;
        switch(op) {
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubtractOperation();
                break;
            case "*":
                operation = new MultiplyOperation();
                break;
            case "/":
                operation = new DivideOperation();
                break;
            case "SQR":
                operation = new SquareOperation();
                break;
            default:
                throw new UnsupportedOperationException("Operation not supported");
        }
        execute(operation);
    }

    public void execute(Operation operation) {
        operation.apply(values);
    }
}
