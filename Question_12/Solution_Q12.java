package Question_12;

/**
 * This class provides a solution to the Integer to Roman problem.
 *
 * The method intToRoman converts an integer to its Roman numeral
 * representation.
 *
 * Author: Aarav Goyal
 */
class Solution_Q12 {
    /**
     * Converts an integer to its Roman numeral representation.
     *
     * @param num the integer to convert
     * @return the Roman numeral representation of the integer
     */
    public String intToRoman(int num) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        String str = "";

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                str += symbols[i];
            }
        }

        return str;
    }
}