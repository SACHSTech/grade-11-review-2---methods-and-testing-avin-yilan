package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import gr11review.part2.Utility;

public class UtilityTest{
    @Test
    public void sumNumbersTest1() {
        assertEquals(123, Utility.sumNumbers("abc123xyz"));
    }
    @Test
    public void sumNumbersTest2() {
        assertEquals(44, Utility.sumNumbers("aa11b33"));
    }
    @Test
    public void sumNumbersTest3() {
        assertEquals(18, Utility.sumNumbers("7 11"));
    }

   
    public void alphaWordTest1() throws Exception {
        assertEquals("accompany", Utility.alphaWord("UtilityTest.java"));
    }
    public void alphaWordTest2() {

    }
    public void alphaWordTest3() {

    }

    @Test
    public void notAloneTest1() {
        int nums[] = {1, 2, 3};
        nums = Utility.notAlone(nums, 2);
        assertTrue(Arrays.equals(new int[] {1, 3, 3}, nums));
    }

    @Test
    public void notAloneTest2() {
        int nums2[] = {1, 2, 3, 2, 5, 2};
        nums2 = Utility.notAlone(nums2, 2);
        assertTrue(Arrays.equals(new int[] {1, 3, 3, 5, 5, 2}, nums2));
    }

    @Test
    public void notAloneTest3() {
            int nums3[] = {3, 4};
        nums3 = Utility.notAlone(nums3, 3);
        assertTrue(Arrays.equals(new int[] {3, 4}, nums3));         
    }

            
}
