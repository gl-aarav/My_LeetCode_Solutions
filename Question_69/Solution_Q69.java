package Question_69;

/**
 * This class provides a solution to the problem of computing the square root of
 * a non-negative integer using Newton's approximation.
 *
 * @author Aarav Goyal
 */
public class Solution_Q69 {
    /**
     * Computes the integer square root of the given non-negative integer using
     * Newton's approximation.
     *
     * @param x the input non-negative integer
     * @return the integer square root of x
     */
    public int mySqrt(int x) {
        if (x < 2)
            return x;

        long r = x;
        while (r * r > x) {
            r = (r + x / r) / 2;
        }
        return (int) r;
    }
}