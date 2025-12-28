package Question_4;

/**
 * This class provides a solution to the Median of Two Sorted Arrays problem.
 *
 * The method findMedianSortedArrays takes two sorted arrays and returns the
 * median of the combined sorted array.
 *
 * Author: Aarav Goyal
 */
class Solution_Q4 {
    /**
     * Finds the median of two sorted arrays.
     *
     * @param nums1 the first sorted array
     * @param nums2 the second sorted array
     * @return the median of the combined sorted array
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] concatedArray = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length + nums2.length; i++) {
            if (i < nums1.length)
                concatedArray[i] = nums1[i];
            else
                concatedArray[i] = nums2[i - nums1.length];
        }

        for (int outer = 1; outer < concatedArray.length; outer++) {
            int key = concatedArray[outer];
            int inner = outer - 1;
            while (inner >= 0 && concatedArray[inner] > key) {
                concatedArray[inner + 1] = concatedArray[inner];
                inner--;
            }
            concatedArray[inner + 1] = key;
        }
        if (concatedArray.length % 2 == 1)
            return concatedArray[concatedArray.length / 2];
        else
            return (concatedArray[concatedArray.length / 2] + concatedArray[concatedArray.length / 2 - 1]) / (double) 2;
    }
}