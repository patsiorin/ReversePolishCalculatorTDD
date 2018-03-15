import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Valerii Patsiorin on 15.03.2018.
 */
public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void createCalculator() {
        calculator = new Calculator();
    }
    @Test
    public void testNewCalculatorHasAnAccumulatorOfZero() {
        assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
    }

    @Test
    public void testSettingAccumulatorValue() {
        BigDecimal value = new BigDecimal(42);
        calculator.setAccumulator(value);
        assertEquals(value, calculator.getAccumulator());
    }
}
