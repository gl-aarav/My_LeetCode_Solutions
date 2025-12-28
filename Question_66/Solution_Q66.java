package Question_66;

/**
 * This class provides a solution to the problem of incrementing a number
 * represented as an array of digits.
 *
 * @author Aarav Goyal
 */
public class Solution_Q66 {
    /**
     * Increments the number represented by the given array of digits by one.
     *
     * @param digits the array of digits representing the number
     * @return the resulting array of digits after incrementing by one
     */
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}