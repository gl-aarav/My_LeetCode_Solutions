package Question_88;

/**
 * This class provides a solution to the problem of merging two sorted arrays.
 *
 * @author Aarav Goyal
 */
public class Solution_Q88 {
    /**
     * Merges two sorted arrays into one sorted array in-place.
     *
     * @param nums1 the first sorted array with enough space to hold the merged
     *              array
     * @param m     the number of valid elements in nums1
     * @param nums2 the second sorted array
     * @param n     the number of valid elements in nums2
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
}