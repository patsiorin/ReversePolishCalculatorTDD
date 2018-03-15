import java.math.BigDecimal;

/**
 * Created by Valerii Patsiorin on 15.03.2018.
 */
public class Calculator {
    private BigDecimal accumulator = BigDecimal.ZERO;

    public BigDecimal getAccumulator() {
        return accumulator;
    }

    public void setAccumulator(BigDecimal accumulator) {
        this.accumulator = accumulator;
    }

    public void enter() {
    }

    public void drop() {
    }
}
