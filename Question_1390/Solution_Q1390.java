package Question_1390;

/**
 * This class provides a solution to the problem of finding the sum of divisors
 * of integers with exactly four divisors.
 *
 * @author Aarav Goyal
 * @since 01/04/2025
 */
public class Solution_Q1390 {
    /**
     * Returns the sum of divisors of integers in the array that have exactly four
     * divisors.
     *
     * @param nums the input array of integers
     * @return the total sum of divisors for numbers with exactly four divisors
     */
    public int sumFourDivisors(int[] nums) {
        int total = 0;
        for (int x : nums) {
            int cnt = 0, sum = 0, r = (int) Math.sqrt(x);
            for (int d = 1; d <= r && cnt <= 4; d++) {
                if (x % d == 0) {
                    int e = x / d;
                    if (d == e) {
                        cnt++;
                        sum += d;
                    } else {
                        cnt += 2;
                        sum += d + e;
                    }
                }
            }
            if (cnt == 4)
                total += sum;
        }
        return total;
    }
}