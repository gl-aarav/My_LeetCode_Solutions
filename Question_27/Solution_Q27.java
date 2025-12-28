package Question_27;

/**
 * This class provides a solution to the Remove Element problem.
 *
 * The method removeElement removes all instances of a given value in-place from
 * an array and returns the new length.
 *
 * Author: Aarav Goyal
 */
class Solution_Q27 {
    /**
     * Removes all instances of a given value in-place from an array and returns the
     * new length.
     *
     * @param nums the input array
     * @param val  the value to remove
     * @return the length of the array after removing the value
     */
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int n : nums) {
            if (n != val)
                nums[k++] = n;
        }
        return k;
    }
}