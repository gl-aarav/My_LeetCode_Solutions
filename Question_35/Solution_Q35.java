package Question_35;

/**
 * This class provides a solution to the Search Insert Position problem.
 *
 * The method searchInsert finds the index at which a target value should be
 * inserted in a sorted array.
 *
 * Author: Aarav Goyal
 */
class Solution_Q35 {
    /**
     * Finds the index at which a target value should be inserted in a sorted array.
     *
     * @param nums   the sorted array of integers
     * @param target the target value to insert
     * @return the index at which the target value should be inserted
     */
    public int searchInsert(int[] nums, int target) {
        if (nums[0] > target) {
            return 0;
        } else if (nums[nums.length - 1] < target) {
            return nums.length;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target)
                    return i;
            }
            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] < target && nums[i] > target)
                    return i;
            }
        }
        return 0;
    }
}