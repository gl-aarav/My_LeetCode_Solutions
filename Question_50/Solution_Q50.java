package Question_50;

/**
 * This class provides a solution to the problem of calculating x raised to the
 * power n.
 *
 * @author Aarav Goyal
 * @since 01/04/2025
 */
public class Solution_Q50 {
    /**
     * Calculates x raised to the power n.
     *
     * @param x the base
     * @param n the exponent
     * @return the result of x raised to the power n
     */
    public double myPow(double x, int n) {
        if (n == 0)
            return 1.0;
        if (x == 1.0)
            return 1.0;
        if (x == -1.0)
            return (n % 2 == 0) ? 1.0 : -1.0;
        if (x == 0.0)
            return 0.0;

        long exp = n;
        double base = x;
        if (exp < 0) {
            base = 1.0 / base;
            exp = -exp;
        }

        double result = 1.0;
        while (exp > 0) {
            if (exp % 2 == 1)
                result *= base;
            base *= base;
            exp /= 2;
        }
        return result;
    }
}