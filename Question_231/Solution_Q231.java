package Question_231;

/**
 * This class provides a solution to the problem of determining if a number is a
 * power of two.
 *
 * @author Aarav Goyal
 */
public class Solution_Q231 {
    /**
     * Determines if the given number is a power of two.
     *
     * @param n the number to check
     * @return true if the number is a power of two, false otherwise
     */
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        return (n & (n - 1)) == 0;
    }
}