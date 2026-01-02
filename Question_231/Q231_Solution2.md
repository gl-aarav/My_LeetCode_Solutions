# Question 231: Power of Two (Solution 2)

## Problem Description
Given an integer `n`, write a function that returns `true` if `n` is a power of two, and `false` otherwise.

## Step-by-Step Explanation

1. **Understand the Approach:**
   - The largest power of two within the range of a 32-bit integer is `2^30 = 1073741824`.
   - If `n` is a power of two, it must divide `1073741824` evenly.

2. **Check for Non-Positive Numbers:**
   - If `n` is less than or equal to 0, it cannot be a power of two.

3. **Use Division:**
   - Check if `1073741824 % n == 0`.
   - If true, `n` is a power of two.

## Code Implementation

```java
class Solution2_Q231 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        // The largest power of two within int range is 2^30 = 1073741824
        // If n is a power of two, it divides 2^30 evenly.
        return 1_073_741_824 % n == 0;
    }
}
```