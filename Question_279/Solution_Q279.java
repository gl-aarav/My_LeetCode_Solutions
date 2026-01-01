package Question_279;

/**
 * This class provides a solution to the problem of finding the least number of
 * perfect square numbers that sum to a given integer.
 *
 * @author Aarav Goyal
 */
public class Solution_Q279 {
    /**
     * Finds the least number of perfect square numbers that sum to the given
     * integer.
     *
     * @param n the target integer
     * @return the least number of perfect square numbers that sum to n
     */
    public int numSquares(int n) {
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
            for (int j = 1; j * j <= i; j++) {
                int s = j * j;
                if (arr[i - s] + 1 < arr[i]) {
                    arr[i] = arr[i - s] + 1;
                }
            }
        }
        return arr[n];
    }
}