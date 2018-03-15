import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Valerii Patsiorin on 15.03.2018.
 */
public class CalculatorTest {
    @Test
    public void testNewCalculatorHasAnAccumulatorOfZero() {
        Calculator calculator = new Calculator();
        assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
    }

    @Test
    public void testSettingAccumulatorValue() {
        Calculator calculator = new Calculator();
        BigDecimal value = new BigDecimal(42);
        calculator.setAccumulator(value);
    }
}
