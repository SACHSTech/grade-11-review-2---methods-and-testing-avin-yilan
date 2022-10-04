package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import gr11review.part2.Utility;

public class UtilityTest {

    @Test
    public void addTest1() {
        assertEquals (true, Utility.xyBalance("aaxbby"));
    }

    @Test
    public void addTest2() {
        assertEquals (false, Utility.xyBalance("aaxbb"));
    }

    @Test
    public void addTest3() {
        assertEquals (false, Utility.xyBalance("yaaxbb"));
    }
    
}
