package fund5;

public class strbui3 {

    // Reverse a String (using StringBuilder class)
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Chaitu");
        for (int i = 0; i < str.length() / 2; i++) {
            int front = i;
            int back = str.length() - i - 1;

            char frontchar = str.charAt(front);
            char backchar = str.charAt(back);

            str.setCharAt(front, backchar);
            str.setCharAt(back, frontchar);

        }
        System.out.println(str);
    }
}

// public static void main(String[] args) {
// StringBuilder str = new StringBuilder("chaitanya");
// for (int i = str.length() - 1; i >= 0; i--) {
// System.out.print(str.charAt(i));
// }
// }
