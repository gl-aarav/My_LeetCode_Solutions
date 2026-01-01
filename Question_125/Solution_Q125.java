package Question_125;

/**
 * This class provides a solution to the problem of determining if a string is a
 * valid palindrome.
 *
 * @author Aarav Goyal
 * @since 25/31/2025
 */
public class Solution_Q125 {
    /**
     * Determines if the given string is a palindrome, considering only alphanumeric
     * characters and ignoring cases.
     *
     * @param s the input string
     * @return true if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !isAlphaNum(s.charAt(left)))
                left++;
            while (left < right && !isAlphaNum(s.charAt(right)))
                right--;

            char a = toLower(s.charAt(left));
            char b = toLower(s.charAt(right));
            if (a != b)
                return false;

            left++;
            right--;
        }
        return true;
    }

    /**
     * Checks if the given character is alphanumeric.
     *
     * @param c the character to check
     * @return true if the character is alphanumeric, false otherwise
     */
    private boolean isAlphaNum(char c) {
        return (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9');
    }

    /**
     * Converts the given character to lowercase if it is uppercase.
     *
     * @param c the character to convert
     * @return the lowercase equivalent of the character, or the character itself if
     *         it is not uppercase
     */
    private char toLower(char c) {
        return (c >= 'A' && c <= 'Z') ? (char) (c - 'A' + 'a') : c;
    }
}