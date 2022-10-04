package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;


import java.io.IOException;


import org.junit.jupiter.api.Test;
import gr11review.part2.Utility;

public class UtilityTest {
    // arrays that are used in testing are defined here
    
    int[] ArrWithoutTenArray1In = {1, 10, 10, 2};
    int[] ArrWithoutTenArray1Out = {1, 2, 0, 0};
    int[] ArrWithoutTenArray2In = {10, 2, 10};
    int[] ArrWithoutTenArray2Out = {2, 0, 0};
    int[] ArrWithoutTenArray3In = {1, 99, 10};
    int[] ArrWithoutTenArray3Out = {1, 99, 0};
    int[] ArrWithoutTenArray4In = {1, 2, 10, 3, 10};
    int[] ArrWithoutTenArray4Out = {1, 2, 3, 0, 0};
    int[] ArrWithoutTenArray5In = {10};
    int[] ArrWithoutTenArray5Out = {0};
    int[] ArrWithoutTenArray6In = {};
    int[] ArrWithoutTenArray6Out = {};
    int[] ArrSeriesUpArray1 = {1};
    int[] ArrSeriesUpArray2 = {1, 1, 2};
    int[] ArrSeriesUpArray3 = {1, 1, 2, 1, 2, 3};
    int[] ArrSeriesUpArray4 = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4};
    int[] ArrSeriesUpArray5 = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5};
    int[] ArrSeriesUpArray6 = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6};
    int[][] ArrReverseArray1In = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] ArrReverseArray1Out = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
    int[][] ArrReverseArray2In = {{1, 4, 7}, {4, 5, 6}, {7, 4, 1}};
    int[][] ArrReverseArray2Out = {{1, 4, 7}, {6, 5, 4}, {7, 4, 1}};
    int[][] ArrReverseArray3In = {{2, 3}, {4, 5}, {1, 1}};
    int[][] ArrReverseArray3Out = {{1, 1}, {5, 4}, {3, 2}};


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
        assertArrayEquals (ArrWithoutTenArray1Out, Utility.withoutTen(ArrWithoutTenArray1In));
    }

    @Test
    public void withoutTenTest2() {
        assertArrayEquals (ArrWithoutTenArray2Out, Utility.withoutTen(ArrWithoutTenArray2In));
    }

    @Test
    public void withoutTenTest3() {
        assertArrayEquals (ArrWithoutTenArray3Out, Utility.withoutTen(ArrWithoutTenArray3In));
    }

    @Test
    public void withoutTenTest4() {
        assertArrayEquals (ArrWithoutTenArray4Out, Utility.withoutTen(ArrWithoutTenArray4In));
    }

    @Test
    public void withoutTenTest5() {
        assertArrayEquals (ArrWithoutTenArray5Out, Utility.withoutTen(ArrWithoutTenArray5In));
    }

    @Test
    public void withoutTenTest6() {
        assertArrayEquals (ArrWithoutTenArray6Out, Utility.withoutTen(ArrWithoutTenArray6In));
    }

    @Test
    public void seriesUpTest1() {
        assertArrayEquals (ArrSeriesUpArray1, Utility.seriesUp(1));
    }

    @Test
    public void seriesUpTest2() {
        assertArrayEquals (ArrSeriesUpArray2, Utility.seriesUp(2));
    }

    @Test
    public void seriesUpTest3() {
        assertArrayEquals (ArrSeriesUpArray3, Utility.seriesUp(3));
    }

    @Test
    public void seriesUpTest4() {
        assertArrayEquals (ArrSeriesUpArray4, Utility.seriesUp(4));
    }

    @Test
    public void seriesUpTest5() {
        assertArrayEquals (ArrSeriesUpArray5, Utility.seriesUp(5));
    }

    @Test
    public void seriesUpTest6() {
        assertArrayEquals (ArrSeriesUpArray6, Utility.seriesUp(6));
    }

    @Test
    public void reverseTest1() {
        assertArrayEquals (ArrReverseArray1Out, Utility.reverse(ArrReverseArray1In));
    }

    @Test
    public void reverseTest2() {
        assertArrayEquals (ArrReverseArray2Out, Utility.reverse(ArrReverseArray2In));
    }
    
    @Test
    public void reverseTest3() {
        assertArrayEquals (ArrReverseArray3Out, Utility.reverse(ArrReverseArray3In));
    }

    
}
