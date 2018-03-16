import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Valerii Patsiorin on 16.03.2018.
 */
public class CustomOperationsTest {
    private Calculator calculator;

    @Before
    public void createCalculatorWithTwoValues() {
        calculator = new Calculator();
        calculator.setAccumulator(new BigDecimal(4));
        calculator.enter();
        calculator.setAccumulator(new BigDecimal(6));
    }

    @Test
    public void testCustomOperationExecute() {
        Operation operation = values -> {
            BigDecimal value1 = values.peek();
            values.pop();
            BigDecimal value2 = values.peek();
            values.pop();
            values.replaceTop(value2.remainder(value1));
        };
        calculator.execute(operation);

        assertEquals(new BigDecimal(4), calculator.getAccumulator());
    }
}
