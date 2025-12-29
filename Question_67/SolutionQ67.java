package Question_67;

/**
 * This class provides a solution to the problem of adding two binary strings.
 *
 * @author Aarav Goyal
 */
public class SolutionQ67 {
    /**
     * Adds two binary strings and returns their sum as a binary string.
     *
     * @param a the first binary string
     * @param b the second binary string
     * @return the sum of the two binary strings as a binary string
     */
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        char[] res = new char[Math.max(a.length(), b.length()) + 1];
        int k = res.length - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int da = (i >= 0) ? (a.charAt(i) - '0') : 0;
            int db = (j >= 0) ? (b.charAt(j) - '0') : 0;
            int sum = da + db + carry;
            res[k] = (char) ('0' + (sum & 1));
            carry = (sum >> 1);
            i--;
            j--;
            k--;
        }

        while (k >= 0) {
            res[k] = '0';
            k--;
        }

        int start = 0;
        while (start < res.length - 1 && res[start] == '0')
            start++;
        return new String(res, start, res.length - start);
    }
}