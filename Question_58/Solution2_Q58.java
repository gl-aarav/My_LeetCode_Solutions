/**
 * This class provides an alternative solution to the problem of finding the
 * length of the last word in a given string.
 *
 * @author Aarav Goyal
 */
public class Solution2_Q58 {
    /**
     * Returns the length of the last word in the given string using a concise
     * approach.
     * A word is defined as a maximal substring consisting of non-space characters
     * only.
     *
     * @param s the input string
     * @return the length of the last word
     */
    public int lengthOfLastWord(String s) {
        return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }
}