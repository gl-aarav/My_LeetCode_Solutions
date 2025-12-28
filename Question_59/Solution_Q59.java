package Question_59;

/**
 * This class provides a solution to the problem of generating an n x n matrix
 * filled with elements from 1 to n^2 in spiral order.
 *
 * @author Aarav Goyal
 */
public class Solution_Q59 {
    /**
     * Generates an n x n matrix filled with elements from 1 to n^2 in spiral order.
     *
     * @param n the size of the matrix
     * @return the generated spiral matrix
     */
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int cur = 1, end = n * n;

        while (top <= bottom && left <= right) {
            for (int c = left; c <= right && cur <= end; c++)
                res[top][c] = cur++;
            top++;

            for (int r = top; r <= bottom && cur <= end; r++)
                res[r][right] = cur++;
            right--;

            if (top <= bottom) {
                for (int c = right; c >= left && cur <= end; c--)
                    res[bottom][c] = cur++;
                bottom--;
            }

            if (left <= right) {
                for (int r = bottom; r >= top && cur <= end; r--)
                    res[r][left] = cur++;
                left++;
            }
        }

        return res;
    }
}