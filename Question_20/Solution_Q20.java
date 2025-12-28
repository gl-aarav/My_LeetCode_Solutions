package Question_20;

/**
 * This class provides a solution to the Valid Parentheses problem.
 *
 * The method isValid checks if a given string of parentheses is valid.
 *
 * Author: Aarav Goyal
 */
public class Solution_Q20 {
    /**
     * Checks if a given string of parentheses is valid.
     *
     * @param s the input string containing parentheses
     * @return true if the string is valid, false otherwise
     */
    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;

        char[] stack = new char[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c;
            } else {
                if (top < 0)
                    return false;
                char t = stack[top--];
                if (c == ')' && t != '(')
                    return false;
                if (c == '}' && t != '{')
                    return false;
                if (c == ']' && t != '[')
                    return false;
            }
        }

        return top == -1;
    }
}