package Question_14;

/**
 * This class provides a solution to the Longest Common Prefix problem.
 *
 * The method longestCommonPrefix finds the longest common prefix string amongst
 * an array of strings.
 *
 * Author: Aarav Goyal
 */
class Solution_Q14 {
    /**
     * Finds the longest common prefix string amongst an array of strings.
     *
     * @param strs the array of strings
     * @return the longest common prefix string
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                if (prefix.isEmpty())
                    return "";
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}