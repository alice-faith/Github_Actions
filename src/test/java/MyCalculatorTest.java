import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculatorTest {

    @Test
   public void calculatorTest() {
        MyCalculator myCalculator = new MyCalculator();
        int sum = myCalculator.calculateSum(7, 8);
        assertEquals(15, sum);

    }
}