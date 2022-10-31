package gr11review.part2;
import java.io.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Utility {

	/**
	 * 
	 * Given a string, determines if every x is balanced by a following y
	 * 
	 * @param str Input String
	 * @return true if the string is xy_Balanced, meaning every x is followed by a y later in the string, and false if not	
	 * 
	 * @author Avin A.
	 */

	public static boolean xyBalance(String str) {
		// keeps track of whether each letter is present and where is the last index they appear in
        boolean boolYSeen = false, boolXSeen = false;
        int intLastYAt = -1, intLastXAt = -1;
    
		// tracks for 'y'
        int i = str.length() - 1;
        while (boolYSeen == false && i >= 0) {
            if (str.charAt(i) != 'y') {
                i --;
            }
            else {
                boolYSeen = true;
                intLastYAt = i;
                break;
            }
        }
        

		// tracks for 'x'
        i = str.length() - 1;
        while (boolXSeen == false && i >= 0) {
            if (str.charAt(i) != 'x') {
                i --;
            }
            else {
                boolXSeen = true;
                intLastXAt = i;
                break;
            }
        }

		// final values returned based on whether x and y were present
        if (boolXSeen == true) {
            if (intLastXAt > intLastYAt) {
                return false;
            }
            else {
                return true;
            }
        }
        else {
            return true;
        }
	}
    

	/**
	 * 
	 * Given a file, method looks for the line with the longest word and returns that to user
	 * 
	 * @param filenametxt file input
	 * @return longest word that exists in file
	 * 
	 * @author Avin A.
	 */

	public static String longestWord(String filenametxt) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader (filenametxt));


		// longest word set to empty string with the length of zero
		int intLongestWordCnt = 0;
		String strLongestStr = "";

		// line one of the file read
		String strCurrentLine = reader.readLine();

		// while lines still have strings in them each is compared to the longest word in store
		while (strCurrentLine != null) {
			if (strCurrentLine.length() > intLongestWordCnt) {
				intLongestWordCnt = strCurrentLine.length();
				strLongestStr = strCurrentLine;
			}

			strCurrentLine = reader.readLine();
		}

		// reader closes
		reader.close();

        return strLongestStr;
	
	}


	/**
	 * 
	 * Given an array, a new array is returned with all values equal to ten removed and everything else shifted to the left
	 * 
	 * @param nums array with tens
	 * @return modified array with ten's removed and everything shifted to the left
	 * 
	 * @author Avin A.
	 */

	public static int[] withoutTen (int[] nums) {

		// new array and its placeholder created
		int[] newNums = new int[nums.length];
		int intPlaceHolderInNew = 0;
		
		// for every element that is not ten, an element is filled in the new array and the placeholder is updated
		for (int i = 0; i < nums.length; i ++) {
			if (nums[i] != 10) {
				newNums[intPlaceHolderInNew] = nums[i];
                intPlaceHolderInNew++;
			}
		}

		// final zeros added in case there are other values in the new array
        while (intPlaceHolderInNew < nums.length) {
            newNums[intPlaceHolderInNew] = 0;
            intPlaceHolderInNew++;
        }

        return newNums;
	}


	/**
	 * 
	 * Given n, an array with the length of n(n+1)/2 is created with the values of 1, 1~2, 1~3, 1~n
	 * 
	 * @param n number
	 * @return created array with n(n+1)/2 elements that are sorted: 1, 1, 2, 1, 2, 3, ..., 1, ..., n
	 * 
	 * @author Avin A.
	 */

	public static int[] seriesUp (int n) {
		// new array made
		int[] myArray = new int[n * (n + 1) / 2];
		int intPlaceHolder = 0;
		
		for (int i = 1; i <= n; i ++) {
			for (int j = 1; j <= i; j ++) {
				myArray[intPlaceHolder] = j;
				intPlaceHolder++;
			}
		}
		
		return myArray;
		
	}


	/**
	 * 
	 * Given an array, all the values are reversed
	 * 
	 * @param arr initial array
	 * @return array with values reversed
	 * 
	 * @author Avin A.
	 */

	public static int[][] reverse (int[][] arr) {

		// new array made
		int[][] reverseArray = new int[arr.length][arr[0].length];
													
		// using subtraction, the index is found in every loop based on i and j
		for (int i = 0; i < arr.length; i ++) {
			for (int j = 0; j < arr[0].length; j ++) {
				reverseArray[i][j] = arr[arr.length - 1 - i][arr[0].length - 1 - j];
			}
		}
		
		return reverseArray;
		
	}
    

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

