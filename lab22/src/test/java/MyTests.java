import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyTests {
    @Test
    void isTrueTest()
    {
        assertTrue(true);
    }

    @Test
    void additionTest()
    {
        assertEquals(4, 2 + 2);
    }
}
