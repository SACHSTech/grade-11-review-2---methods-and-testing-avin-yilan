package gr11review.part2;
import java.io.*;

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
        boolean boolYSeen = false, boolXSeen = false;
        int intLastYAt = -1, intLastXAt = -1;
    
        int i = str.length() - 1;
        while (boolYSeen == false) {
            if (str.charAt(i) != 'y') {
                i --;
            }
            else {
                boolYSeen = true;
                intLastYAt = i;
                break;
            }
        }
        
        i = str.length() - 1;
        while (boolXSeen == false) {
            if (str.charAt(i) != 'x') {
                i --;
            }
            else {
                boolXSeen = true;
                intLastXAt = i;
                break;
            }
        }


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

		int intLongestWordCnt = 0;
		String strLongestStr = "";

		String strCurrentLine = reader.readLine();
		String strCurrentString = strCurrentLine.strip();

		while (strCurrentString != null) {
			if (strCurrentString.length() > intLongestWordCnt) {
				intLongestWordCnt = strCurrentString.length();
				strLongestStr = strCurrentString;
			}

			strCurrentLine = reader.readLine();
			strCurrentString = strCurrentLine.strip();
		}

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

		int[] newNums = new int[nums.length];
		int intPlaceHolderInNew = 0;
		
		for (int i = 0; i < nums.length; i ++) {
			if (nums[i] != 10) {
				newNums[intPlaceHolderInNew] = nums[i];
                intPlaceHolderInNew++;
			}
		}

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

		int[][] reverseArray = new int[arr.length][arr[0].length];
													
		
		for (int i = 0; i < arr.length; i ++) {
			for (int j = 0; j < arr[0].length; j ++) {
				reverseArray[i][j] = arr[arr.length - 1 - i][arr[0].length - 1 - j];
			}
		}
		
		return reverseArray;
		
	}
    
}