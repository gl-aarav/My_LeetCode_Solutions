/**
 * This class provides a solution to the problem of finding the index of the
 * first occurrence of a substring in a string.
 *
 * @author Aarav Goyal
 * @since 1/1/2026
 */
public class Solution_Q28 {
    /**
     * Finds the index of the first occurrence of the substring `needle` in the
     * string `haystack`.
     *
     * @param haystack the string to search within
     * @param needle   the substring to search for
     * @return the index of the first occurrence of `needle` in `haystack`, or -1 if
     *         `needle` is not found
     */
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}