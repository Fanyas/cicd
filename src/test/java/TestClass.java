import org.example.Calc;

import static org.example.Calc.plus;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.*;

public class TestClass {
    @org.junit.jupiter.api.Test
    void trueAssumption() {
        assumeTrue(plus(2, 2) == 4);
        assertEquals(plus(2,2),4);
    }

    @org.junit.jupiter.api.Test
    void falseAssumption() {
        assumeFalse(false);
        assumeFalse(plus(2, 2) == 5);
        assertEquals(5 + 2, 7);
    }
}