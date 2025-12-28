package Question_13;

/**
 * This class provides a solution to the Roman to Integer problem.
 *
 * The method romanToInt converts a Roman numeral to its integer representation.
 *
 * Author: Aarav Goyal
 */
class Solution_Q13 {
    /**
     * Converts a Roman numeral to its integer representation.
     *
     * @param s the Roman numeral string
     * @return the integer representation of the Roman numeral
     */
    public int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = getValue(s.charAt(i));

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }

        return total;
    }

    /**
     * Returns the integer value of a Roman numeral character.
     *
     * @param c the Roman numeral character
     * @return the integer value of the character
     */
    private int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}