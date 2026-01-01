package Question_3075;

/**
 * This class provides a solution to the problem of finding the maximum
 * happiness sum by selecting individuals with adjusted happiness levels.
 *
 * @author Aarav Goyal
 */
public class Solution_Q3075 {
    /**
     * Finds the maximum happiness sum by selecting `k` individuals with adjusted
     * happiness levels.
     *
     * @param happiness the array of happiness levels
     * @param k         the number of individuals to select
     * @return the maximum happiness sum
     */
    public long maximumHappinessSum(int[] happiness, int k) {
        java.util.Arrays.sort(happiness);
        long sum = 0;
        int n = happiness.length;
        for (int i = 0; i < k; i++) {
            int idx = n - 1 - i;
            int val = happiness[idx] - i;
            if (val <= 0)
                break;
            sum += val;
        }
        return sum;
    }
}