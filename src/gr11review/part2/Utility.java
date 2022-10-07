package gr11review.part2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Utility {

    // Yilan's branch

    /**
     * Given a string, return the sum of the numbers appearing in the string,
     * ignoring all other characters. A number is a series of 1 or more digit chars
     * in a row. (Note: Character.isDigit(char) tests if a char is one of the chars
     * '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
     * Signature public static int sumNumbers(String str)
     * 
     * @param str
     * @return
     */
    public static int sumNumbers(String str) {
        // The sum to be returned at the end
        int sum = 0;
        // A string to store the number 
        String number = "";

        // Iterate through the input string
        for (int i = 0; i < str.length(); i++) {
            // Get the character at index i
            char c = str.charAt(i);

            // Check if it's a digit
            if (Character.isDigit(c)) {
                // Append the digit to the number
                number = number + c;
            } else if (number.length() > 0) {
                // Sum the number when the next char is no longer a digit
                sum = sum + Integer.parseInt(number);
                // Reset the number to blank
                number = "";
            }
        }

        // To sum up the last number if there is any
        if (number.length() > 0) {
            sum = sum + Integer.parseInt(number);
        }

        return sum;

    }

    /**
     * Write a method alphaWord(String filenametxt) such that given the name of a
     * file filenametxt that contains a single word on each line, returns the word
     * that is alphabetically first.
     * 
     * @param filenametxt
     * @return
     * @throws Exception
     */
    public static String alphaWord(String filenametxt) throws Exception {
        // Create a reader to read the file
        BufferedReader br = new BufferedReader(new FileReader(filenametxt));
        // Variable to store each word
        String line;
        // Initialize alpha with a blank string
        String alpha = "";

        // Read each line, till the end of the file
        while ((line = br.readLine()) != null) {
            // If alpha is blank or is alphabetically behind the new word
            if (alpha.length() == 0 || alpha.compareTo(line) > 0) {
                // New alpha!
                alpha = line;
            }

        }

        // Close the reader
        br.close();

        return alpha;
    }

    /**
     * We'll say that an element in an array is "alone" if there are values before
     * and after it, and those values are different from it. Return a version of the
     * given array where every instance of the given value which is alone is
     * replaced by whichever value to its left or right is larger. public int[]
     * notAlone(int[] nums, int val)
     * 
     * @param nums
     * @param value
     * @return
     */
    public static int[] notAlone(int[] nums, int value) {
        // If there are less than 3 elements, simply return the same array because
        // there's no before/after
        if (nums.length < 3)
            return nums;

        // Iterate from the 2nd element to the 2nd last element
        for (int i = 1; i < nums.length - 1; i++) {
            int num = nums[i];
            // If the element matches the specified value
            if (num == value) {
                // Get before and after values
                int before = nums[i - 1];
                int after = nums[i + 1];

                // Check if the element is alone
                if (before != num && after != num) {
                    // Found an alone element, replace it with the larger number
                    if (before > after)
                        nums[i] = before;
                    else
                        nums[i] = after;
                }
            }
        }

        return nums;
    }

    /**
     * Main method I added just to test the methods
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // Testing with my main method for now, will replace these with test cases
        System.out.println(sumNumbers("abc123xyz"));
        System.out.println(sumNumbers("aa11b33"));
        System.out.println(sumNumbers("7 11"));

        System.out.println(alphaWord("src/gr11review/test2/Review2_3Test_1.txt"));

        int nums[] = { 1, 2, 3 };
        nums = notAlone(nums, 2);
        System.out.println(Arrays.toString(nums));

        int nums2[] = { 1, 2, 3, 2, 5, 2 };
        nums2 = notAlone(nums2, 2);
        System.out.println(Arrays.toString(nums2));

        int nums3[] = { 3, 4 };
        nums3 = notAlone(nums3, 3);
        System.out.println(Arrays.toString(nums3));
    }
}
