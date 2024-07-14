package fund5;

public class str3 {
    public static void main(String[] args) {
        String name = "Chaitanya Sai";
        int count = 0;
        char x = 'a';
        for (int i = 0; i < name.length(); i++) {
            char str = name.charAt(i);
            if (str == x) {
                count++;
            }

        }
        System.out.println(count);
    }
}
