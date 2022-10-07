package gr11review.part2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

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
        int sum = 0;
        String number = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                // Append the digit to the number
                number = number + c;
            } else if (number.length() > 0) {
                // Sum the number if it's no longer a digit
                sum = sum + Integer.parseInt(number);
                // Reset the number to blank
                number = "";
            }
        }

        // To sum up the last number
        if (number.length() > 0) {
            sum = sum + Integer.parseInt(number);
        }

        return sum;

    }

    public static String alphaWord(String filenametxt) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(filenametxt));
        String line;
        String alpha = "zzzzzzzz";
        while ((line = br.readLine()) != null) {
            // process the line.
            if (alpha.compareTo(line) > 0) {
                // New alpha!
                alpha = line;
            }
            
        }

        br.close();

        return alpha;
    }

    public static int[] notAlone(int[] nums, int value) {
        if (nums.length < 3)
            return nums;
        
        
        return nums;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(sumNumbers("abc123xyz"));
        System.out.println(sumNumbers("aa11b33"));
        System.out.println(sumNumbers("7 11"));

        System.out.println(alphaWord("src/gr11review/test2/Review2_3Test_1.txt"));
    }
}
