package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testCalc() {
        Calculator calc = new Calculator();
        double result = calc.calc(2, 3);
        assertEquals(5.0 / 6.0, result, 0.001);
    }
}
