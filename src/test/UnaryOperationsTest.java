import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Valerii Patsiorin on 16.03.2018.
 */
public class UnaryOperationsTest {
    private Calculator calculator;

    @Before
    public void createCalculatorAndSetAccumulator() {
        calculator = new Calculator();
        calculator.setAccumulator(new BigDecimal(3));
    }

    @Test
    public void testUnaryPlusOperation() {
        calculator.execute("+");
        assertEquals(new BigDecimal(3), calculator.getAccumulator());
    }

    @Test
    public void testUnaryMinusOperation() {
        calculator.execute("-");
        assertEquals(new BigDecimal(-3), calculator.getAccumulator());
    }

    @Test
    public void testSquareOperation() {
        calculator.execute("SQR");
        assertEquals(new BigDecimal(9), calculator.getAccumulator());
    }
}
