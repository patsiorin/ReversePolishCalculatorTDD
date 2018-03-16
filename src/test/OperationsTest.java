import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;
import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Valerii Patsiorin on 15.03.2018.
 */
public class OperationsTest {
    private Calculator calculator;

    @Before
    public void createCalculatorWithTwoValues() {
        calculator = new Calculator();
        calculator.setAccumulator(new BigDecimal(11));
        calculator.enter();
        calculator.setAccumulator(new BigDecimal(22));
    }

    @Test
    public void testAddExecution() {
        calculator.execute("+");
        assertEquals(new BigDecimal(33), calculator.getAccumulator());
    }

    @Test
    public void testSubtractExecution() {
        calculator.execute("-");
        assertEquals(new BigDecimal(-11), calculator.getAccumulator());
    }

    @Test
    public void testMultiplyExecution() {
        calculator.execute("*");
        assertEquals(new BigDecimal(242), calculator.getAccumulator());
    }

    @Test
    public void testDivideExecution() {
        calculator.execute("/");
        assertEquals(new BigDecimal(1), calculator.getAccumulator());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnsupportedOperation() {
        calculator.execute("%");
    }
}
