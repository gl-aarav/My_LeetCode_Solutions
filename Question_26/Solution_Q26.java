package Question_26;

/**
 * This class provides a solution to the Remove Duplicates from Sorted Array
 * problem.
 *
 * The method removeDuplicates removes duplicates in-place from a sorted array
 * and returns the new length.
 *
 * Author: Aarav Goyal
 */
class Solution_Q26 {
    /**
     * Removes duplicates in-place from a sorted array and returns the new length.
     *
     * @param nums the input sorted array
     * @return the length of the array after removing duplicates
     */
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        int k = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}