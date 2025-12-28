/**
 * This class provides a solution to the problem of multiplying two non-negative
 * integers represented as strings.
 *
 * @author Aarav Goyal
 */
public class Solution_Q43 {
    /**
     * Multiplies two non-negative integers represented as strings and returns the
     * product as a string.
     *
     * @param num1 the first non-negative integer as a string
     * @param num2 the second non-negative integer as a string
     * @return the product of num1 and num2 as a string
     */
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int n1 = num1.length();
        int n2 = num2.length();
        int[] res = new int[n1 + n2];

        for (int i = n1 - 1; i >= 0; i--) {
            int d1 = num1.charAt(i) - '0';
            for (int j = n2 - 1; j >= 0; j--) {
                int d2 = num2.charAt(j) - '0';
                int posLow = i + j + 1;
                int posHigh = i + j;

                int sum = d1 * d2 + res[posLow];
                res[posLow] = sum % 10;
                res[posHigh] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        int k = 0;
        while (k < res.length && res[k] == 0) {
            k++;
        }
        while (k < res.length) {
            sb.append(res[k++]);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}