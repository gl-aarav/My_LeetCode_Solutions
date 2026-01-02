# Question 231: Power of Two (Solution 1)

## Problem Description
Given an integer `n`, write a function that returns `true` if `n` is a power of two, and `false` otherwise.

## Step-by-Step Explanation

1. **Understand the Problem:**
   - A number is a power of two if it can be expressed as `2^x`, where `x` is a non-negative integer.
   - For example, 1, 2, 4, 8, 16, etc., are powers of two.

2. **Check for Non-Positive Numbers:**
   - If `n` is less than or equal to 0, it cannot be a power of two.

3. **Use Bitwise Operation:**
   - A number `n` that is a power of two has exactly one bit set in its binary representation.
   - The expression `(n & (n - 1))` clears the lowest set bit of `n`.
   - If `n` is a power of two, `(n & (n - 1))` will be 0.

4. **Return the Result:**
   - Return `true` if `(n & (n - 1)) == 0` and `n > 0`.

## Code Implementation

```java
class Solution_Q231 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
}
```