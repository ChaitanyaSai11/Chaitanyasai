package fund8;

public class recursion14 {
    public static void subsequences(String str, int idx, String newstring) {
        if (idx == str.length()) {
            System.out.println(newstring);
            return;
        }
        char currChar = str.charAt(idx);

        // to be
        subsequences(str, idx + 1, newstring + currChar);

        // or not to be
        subsequences(str, idx + 1, newstring);

    }

    public static void main(String[] args) {
        subsequences("abc", 0, "");
    }
}