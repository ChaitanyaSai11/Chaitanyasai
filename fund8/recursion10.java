package fund8;

public class recursion10 {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, char element, int idx) {
        if (idx == str.length()) {
            System.out.println(first + " " + last);
            return;
        }
        if (element == str.charAt(idx)) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;

            }
        }
        findOccurance(str, element, idx + 1);
    }

    public static void main(String[] args) {
        findOccurance("Chaitanya", 'a', 0);
    }
}

// public static void lastOccurance(String a, char b, int idx, int first, int
// last) {
// if (idx == a.length()) {
// System.out.println(first);
// System.out.println(last);
// return;
// }
// if (b == a.charAt(idx)) {
// if (first == -1) {
// first = idx;
// }
// last = idx;
// }
// lastOccurance(a, b, idx + 1, first, last);
// }

// public static void main(String[] args) {
// int first = -1;
// int last = -1;
// lastOccurance("abaacdaefaah", 'a', 0, first, last);
// }