import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleTest {

    @Test
    void compute_n1() {
        PascalTriangle tr= new PascalTriangle();
        Assertions.assertDoesNotThrow(() -> tr.compute(1));
    }
    @Test
    void compute_n4() {
        PascalTriangle tr= new PascalTriangle();
        Assertions.assertDoesNotThrow(() -> tr.compute(4));
    }
    @Test
    void checkNegative() {
        PascalTriangle tr= new PascalTriangle();
        Assertions.assertThrows(NegativeArraySizeException.class,() -> tr.compute(-1));
    }
    @Test
    void checkZero() {
        PascalTriangle tr= new PascalTriangle();
        Assertions.assertThrows(NegativeArraySizeException.class,() -> tr.compute(0));
    }
}