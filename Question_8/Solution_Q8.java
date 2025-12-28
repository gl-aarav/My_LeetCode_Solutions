package Question_8;

/**
 * This class provides a solution to the String to Integer (atoi) problem.
 *
 * The method myAtoi converts a string to a 32-bit signed integer, following the
 * rules of the atoi function.
 *
 * Author: Aarav Goyal
 */
class Solution_Q8 {
    /**
     * Converts a string to a 32-bit signed integer.
     *
     * @param s the input string
     * @return the converted integer
     */
    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;
        while (i < n && s.charAt(i) == ' ')
            i++;
        int sign = 1;
        if (i < n) {
            char c = s.charAt(i);
            if (c == '+') {
                sign = 1;
                i++;
            } else if (c == '-') {
                sign = -1;
                i++;
            }
        }
        long num = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        while (i < n) {
            char c = s.charAt(i);
            if (c < '0' || c > '9')
                break;
            int d = c - '0';
            num = num * 10 + d;
            long val = sign == 1 ? num : -num;
            if (val > max)
                return max;
            if (val < min)
                return min;
            i++;
        }
        num = sign == 1 ? num : -num;
        if (num > max)
            return max;
        if (num < min)
            return min;
        return (int) num;
    }
}