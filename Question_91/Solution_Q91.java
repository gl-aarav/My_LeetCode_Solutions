package Question_91;

/**
 * This class provides a solution to the problem of decoding a message encoded
 * with numbers.
 *
 * @author Aarav Goyal
 * @since 25/31/2025
 */
public class Solution_Q91 {
    /**
     * Determines the total number of ways to decode the given string.
     *
     * @param s the encoded message
     * @return the total number of ways to decode the message
     */
    public int numDecodings(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int n = s.length();
        int prev2 = 1;
        int prev1 = s.charAt(0) != '0' ? 1 : 0;
        for (int i = 2; i <= n; i++) {
            int curr = 0;
            char c1 = s.charAt(i - 1);
            char c0 = s.charAt(i - 2);

            if (c1 != '0')
                curr += prev1;

            int two = (c0 - '0') * 10 + (c1 - '0');
            if (two >= 10 && two <= 26)
                curr += prev2;

            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}