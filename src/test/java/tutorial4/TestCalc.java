package tutorial4;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalc 

{

    @Test
    void testAdd() {
        assertEquals(new Calc().add(0, 0), 0);
        assertEquals(new Calc().add(1, 2), 3);
        assertEquals(new Calc().add(-1, 2), 1);
        assertEquals(new Calc().add(13648, 896), 14544);
    }

    // @Test 
    // void testSubtract() {
    //     assertEquals(new Calc().subtract(4, 2), 2);
    // }
}
