package Question_7;

/**
 * This class provides a solution to the Reverse Integer problem.
 *
 * The method reverse reverses the digits of a 32-bit signed integer.
 *
 * Author: Aarav Goyal
 */
class Solution_Q7 {
    /**
     * Reverses the digits of a 32-bit signed integer.
     *
     * @param x the integer to reverse
     * @return the reversed integer, or 0 if it overflows
     */
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            result = result * 10 + digit;
        }
        return result;
    }
}