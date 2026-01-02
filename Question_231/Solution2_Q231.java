package Question_231;

/**
 * This class provides an alternative solution to the problem of determining if
 * a number is a power of two.
 *
 * @author Aarav Goyal
 */
public class Solution2_Q231 {
    /**
     * Determines if the given number is a power of two using the largest power of
     * two within int range.
     *
     * @param n the number to check
     * @return true if the number is a power of two, false otherwise
     */
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        // The largest power of two within int range is 2^30 = 1073741824
        // If n is a power of two, it divides 2^30 evenly.
        return 1_073_741_824 % n == 0;
    }
}