package calculator;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    private SimpleCalculator calculator;

    @Test
    void add() {
            SimpleCalculator calculator = new SimpleCalculator();
            assertEquals(30, calculator.add(20, 10), 0.001);
        assertEquals(-30, calculator.add(-20, -10), 0.001);
        assertEquals(20, calculator.add(20, 0), 0.001);
    }

    @Test
    void subtract() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(10, calculator.subtract(20, 10), 0.001);
    }

    @Test
    void multiply() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(200, calculator.multiply(20, 10), 0.001);
    }

    @Test
    void divide() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(2, calculator.divide(20, 10), 0.001);
    }


}