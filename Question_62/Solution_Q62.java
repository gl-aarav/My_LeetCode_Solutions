package Question_62;

/**
 * This class provides a solution to the problem of finding the number of unique
 * paths in an m x n grid.
 *
 * @author Aarav Goyal
 */
public class Solution_Q62 {
    /**
     * Calculates the number of unique paths from the top-left corner to the
     * bottom-right corner of an m x n grid.
     *
     * @param m the number of rows in the grid
     * @param n the number of columns in the grid
     * @return the number of unique paths
     */
    public int uniquePaths(int m, int n) {
        int total = m + n - 2;
        int r = Math.min(m - 1, n - 1);
        long result = 1L;

        for (int i = 1; i <= r; i++) {
            result = result * (total - i + 1) / i;
        }

        return (int) result;
    }
}