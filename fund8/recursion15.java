package fund8;

import java.util.HashSet;

public class recursion15 {
    public static void subsequences(String str, int idx, String newstring, HashSet<String> allsubsequences) {
        if (idx == str.length()) {
            if (allsubsequences.contains(newstring)) {
                return;
            } else {
                System.out.println(newstring);
                allsubsequences.add(newstring);
                return;
            }
        }
        char currChar = str.charAt(idx);

        // to be
        subsequences(str, idx + 1, newstring + currChar, allsubsequences);

        // or not to be
        subsequences(str, idx + 1, newstring, allsubsequences);

    }

    public static void main(String[] args) {
        HashSet<String> allsubsequences = new HashSet<>();
        subsequences("aaa", 0, "", allsubsequences);
    }
}
