package Question_74;

/**
 * This class provides a solution to the problem of searching for a value in a
 * 2D matrix.
 *
 * @author Aarav Goyal
 * @since 01/04/2026
 */
public class Solution_Q74 {
    /**
     * Searches for a target value in an m x n matrix.
     *
     * @param matrix the input 2D matrix
     * @param target the value to search for
     * @return true if the target is found, false otherwise
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int m = matrix.length, n = matrix[0].length;
        int lo = 0, hi = m * n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int r = mid / n, c = mid % n;
            int v = matrix[r][c];
            if (v == target)
                return true;
            if (v < target)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return false;
    }
}