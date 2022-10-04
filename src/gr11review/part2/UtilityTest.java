package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;


import org.junit.jupiter.api.Test;
import gr11review.part2.Utility;

public class UtilityTest {

    @Test
    public void xyBalanceTest1() {
        assertEquals (true, Utility.xyBalance("aaxbby"));
    }

    @Test
    public void xyBalanceTest2() {
        assertEquals (false, Utility.xyBalance("aaxbb"));
    }

    @Test
    public void xyBalanceTest3() {
        assertEquals (false, Utility.xyBalance("yaaxbb"));
    }

    @Test
    public void xyBalanceTest4() {
        assertEquals (true, Utility.xyBalance(""));
    }

    @Test
    public void xyBalanceTest5() {
        assertEquals (false, Utility.xyBalance("ljafghuogyx"));
    }

    @Test
    public void xyBalanceTest6() {
        assertEquals (true, Utility.xyBalance("ayayayyyxy"));
    }

    @Test
    public void xyBalanceTest7() {
        assertEquals (false, Utility.xyBalance("x"));
    }

    @Test
    public void xyBalanceTest8() {
        assertEquals (true, Utility.xyBalance("y"));
    }
    

    @Test
    public void xyBalanceTest9() {
        assertEquals (false, Utility.xyBalance("yx"));
    }

    @Test
    public void longestWordTest1() throws IOException {
        assertEquals ("gnjoeaiheof", Utility.longestWord("C:\\Users\\ASUS\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-avin-yilan\\src\\gr11review\\part2\\FileIOTest1.txt"));
    }
    
}
