package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;


import java.io.IOException;


import org.junit.jupiter.api.Test;
import gr11review.part2.Utility;

public class UtilityTest {

    int[] withoutTenArray1In = {1, 10, 10, 2};
    int[] withoutTenArray1Out = {1, 2, 0, 0};
    int[] withoutTenArray2In = {10, 2, 10};
    int[] withoutTenArray2Out = {2, 0, 0};
    int[] withoutTenArray3In = {1, 99, 10};
    int[] withoutTenArray3Out = {1, 99, 0};
    int[] withoutTenArray4In = {1, 2, 10, 3, 10};
    int[] withoutTenArray4Out = {1, 2, 3, 0, 0};
    int[] withoutTenArray5In = {10};
    int[] withoutTenArray5Out = {0};
    int[] withoutTenArray6In = {};
    int[] withoutTenArray6Out = {};
    int[] seriesUpArray1 = {1};
    int[] seriesUpArray2 = {1, 1, 2};
    int[] seriesUpArray3 = {1, 1, 2, 1, 2, 3};
    int[] seriesUpArray4 = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4};
    int[] seriesUpArray5 = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5};
    int[] seriesUpArray6 = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6};

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
    
    @Test
    public void longestWordTest2() throws IOException {
        assertEquals ("thislineistheanswerbababababababababababab", Utility.longestWord("C:\\Users\\ASUS\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-avin-yilan\\src\\gr11review\\part2\\FileIOTest2.txt"));
    }

    @Test
    public void longestWordTest3() throws IOException {
        assertEquals ("", Utility.longestWord("C:\\Users\\ASUS\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-avin-yilan\\src\\gr11review\\part2\\FileIOTest3.txt"));
    }

    @Test
    public void longestWordTest4() throws IOException {
        assertEquals ("consectetur", Utility.longestWord("C:\\Users\\ASUS\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-avin-yilan\\src\\gr11review\\part2\\FileIOTest4.txt"));
    }

    @Test
    public void withoutTenTest1() {
        assertArrayEquals (withoutTenArray1Out, Utility.withoutTen(withoutTenArray1In));
    }

    @Test
    public void withoutTenTest2() {
        assertArrayEquals (withoutTenArray2Out, Utility.withoutTen(withoutTenArray2In));
    }

    @Test
    public void withoutTenTest3() {
        assertArrayEquals (withoutTenArray3Out, Utility.withoutTen(withoutTenArray3In));
    }

    @Test
    public void withoutTenTest4() {
        assertArrayEquals (withoutTenArray4Out, Utility.withoutTen(withoutTenArray4In));
    }

    @Test
    public void withoutTenTest5() {
        assertArrayEquals (withoutTenArray5Out, Utility.withoutTen(withoutTenArray5In));
    }

    @Test
    public void withoutTenTest6() {
        assertArrayEquals (withoutTenArray6Out, Utility.withoutTen(withoutTenArray6In));
    }

    @Test
    public void seriesUpTest1() {
        assertArrayEquals (seriesUpArray1, Utility.seriesUp(1));
    }

    @Test
    public void seriesUpTest2() {
        assertArrayEquals (seriesUpArray2, Utility.seriesUp(2));
    }

    @Test
    public void seriesUpTest3() {
        assertArrayEquals (seriesUpArray3, Utility.seriesUp(3));
    }

    @Test
    public void seriesUpTest4() {
        assertArrayEquals (seriesUpArray4, Utility.seriesUp(4));
    }

    @Test
    public void seriesUpTest5() {
        assertArrayEquals (seriesUpArray5, Utility.seriesUp(5));
    }

    @Test
    public void seriesUpTest6() {
        assertArrayEquals (seriesUpArray6, Utility.seriesUp(6));
    }

    

    
}
