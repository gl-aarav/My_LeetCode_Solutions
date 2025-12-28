/**
 * This class provides a solution to the Two Sum problem.
 *
 * The method twoSum takes an array of integers and a target value, and returns
 * the indices of the two numbers that add up to the target value.
 *
 * Author: Aarav Goyal
 */
class Solution_Q1 {
    /**
     * Finds two numbers in the array that add up to the target value.
     *
     * @param nums   the array of integers
     * @param target the target sum
     * @return an array containing the indices of the two numbers, or an empty array
     *         if no solution exists
     */
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}