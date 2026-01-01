package Question_3;

/**
 * This class provides a solution to the problem of finding the length of the
 * longest substring without repeating characters.
 *
 * @author Aarav Goyal
 */
public class Solution_Q3 {
    /**
     * Finds the length of the longest substring without repeating characters.
     *
     * @param s the input string
     * @return the length of the longest substring without repeating characters
     */
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }

        int[] charCount = new int[128];

        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            charCount[currentChar]++;

            while (charCount[currentChar] > 1) {
                char leftChar = s.charAt(left);
                charCount[leftChar]--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}