package fund8;

public class recursion13 {

    public static boolean map[] = new boolean[26];

    public static void removeduplicate(String str, int idx, String newstring) {
        if (idx == str.length() - 1) {
            System.out.println(newstring);
            return;
        }
        /*
         * ASCII Values and Character Mapping:
         * 
         * Each character in the English alphabet has a corresponding ASCII value. For
         * example, 'a' has an ASCII value of 97, 'b' is 98, and so on up to 'z' which
         * is 122.
         * The expression currChar - 'a' computes the zero-based index for the
         * character. For example, if currChar is 'a', then 'a' - 'a' is 0. If currChar
         * is 'b', then 'b' - 'a' is 1, and so forth.
         * Boolean Array map:
         * 
         * The boolean array map is initialized to have 26 elements, each corresponding
         * to a letter in the English alphabet (a to z).
         * By using the index currChar - 'a', the code can set and check the presence of
         * each character efficiently
         */
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {// true
            removeduplicate(str, idx + 1, newstring);
        } else {// false
            newstring += currChar;
            map[currChar - 'a'] = true;
            removeduplicate(str, idx + 1, newstring);
        }
    }

    public static void main(String[] args) {
        removeduplicate("abcabcbb", 0, "");
    }
}
