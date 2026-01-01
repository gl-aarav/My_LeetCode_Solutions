/**
 * This class provides a solution to the problem of removing consecutive anagrams from a list of words.
 *
 * @author Aarav Goyal
 */
public class SolutionQ2273 {
    /**
     * Removes consecutive anagrams from the given list of words.
     *
     * @param words the input list of words
     * @return the list of words after removing consecutive anagrams
     */
    public java.util.List<String> removeAnagrams(String[] words) {
        java.util.ArrayList<String> result = new java.util.ArrayList<>();
        String lastSig = null;

        for (String w : words) {
            String sig = sortString(w);
            if (lastSig == null || !sig.equals(lastSig)) {
                result.add(w);
                lastSig = sig;
            }
        }
        return result;
    }

    /**
     * Sorts the characters of the given string to create its anagram signature.
     *
     * @param s the input string
     * @return the sorted string
     */
    private String sortString(String s) {
        char[] arr = s.toCharArray();
        java.util.Arrays.sort(arr);
        return new String(arr);
    }
}