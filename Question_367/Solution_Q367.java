package Question_367;

/**
 * This class provides a solution to the problem of determining if a number is a
 * perfect square.
 *
 * @author Aarav Goyal
 * @since 1/1/2026
 */
public class Solution_Q367 {
    /**
     * Determines if the given number is a perfect square.
     *
     * @param num the number to check
     * @return true if the number is a perfect square, false otherwise
     */
    public boolean isPerfectSquare(int num) {
        int odd = 1;
        while (num > 0) {
            num -= odd;
            odd += 2;
        }
        return num == 0;
    }
}