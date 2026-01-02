# Question 58: Length of Last Word (Solution 2)

## Problem Description
Given a string `s` consisting of words and spaces, return the length of the last word in the string. A word is defined as a maximal substring consisting of non-space characters only.

## Step-by-Step Explanation

1. **Trim the String:**
   - Use the `trim()` method to remove leading and trailing spaces from the string.

2. **Find the Last Space:**
   - Use the `lastIndexOf(" ")` method to find the index of the last space in the trimmed string.

3. **Calculate the Length:**
   - Subtract the index of the last space from the length of the trimmed string to get the length of the last word.

## Code Implementation

```java
class Solution2 {
    public int lengthOfLastWord(String s) {
        return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }
}
```