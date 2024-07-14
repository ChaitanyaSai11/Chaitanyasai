package fund5;

import java.util.Scanner;

public class str9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String username = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '@') {
                break;
            } else {
                username += str.charAt(i);
            }
        }
        System.out.println(username);
        char a = sc.next().charAt(0);
    }
}
