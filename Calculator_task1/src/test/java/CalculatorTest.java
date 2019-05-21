import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void additionInt() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.add(2, 2));

    }

    @Test
    void overFlow() {

        Calculator calc = new Calculator();
        int a = Integer.MAX_VALUE;
        assertThrows(ArithmeticException.class, () -> calc.add(a, 1));
    }

    @Test
    void underFlow() {
        Calculator calc = new Calculator();
        int b = Integer.MIN_VALUE;
        assertThrows(ArithmeticException.class, () -> calc.diff(b, 1));
    }

    @Test
    void nonZeroDivZero() {
        Calculator calc = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> calc.div(4, 0));

    }

    @Test
    void zeroDivZero() {
        Calculator calc = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> calc.div(0, 0));
    }

    @Test
    void diffrenceInt() {
        Calculator calc = new Calculator();
        assertEquals(0, calc.diff(2, 2));

    }

    @Test
    void multiplyInt() {
        Calculator calc = new Calculator();
        int a = Integer.MAX_VALUE;
        assertThrows(ArithmeticException.class, () -> calc.mul(a, 2));
        assertThrows(ArithmeticException.class, () -> calc.mul(a, -2));
        assertEquals(4, calc.mul(2, 2));
    }

    @Test
    void divideInt() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.div(2, 2));
    }

    @Test
    void additionDouble() {
        Calculator calc = new Calculator();
        assertEquals(4.4, calc.add(2.2, 2.2));
    }

    @Test
    void diffrenceDouble() {
        Calculator calc = new Calculator();
        assertEquals(0.1, calc.diff(2.3, 2.2), 0.0001);
    }

    @Test
    void multiplyDouble() {
        Calculator calc = new Calculator();
        assertEquals(4.84, calc.mul(2.2, 2.2), 0.0000001);
    }

    @Test
    void divideDouble() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.div(2.2, 2.2), 0.0000001);

    }

}
