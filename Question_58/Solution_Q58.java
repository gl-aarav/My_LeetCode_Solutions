
/**
 * This class provides a solution to the problem of finding the length of the last word in a given string.
 *
 * @author Aarav Goyal
 */
public class Solution_Q58 {

    /**
     * Returns the length of the last word in the given string. A word is
     * defined as a maximal substring consisting of non-space characters only.
     *
     * @param s the input string
     * @return the length of the last word
     */
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        // skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        int length = 0;
        // count last word characters
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
}
