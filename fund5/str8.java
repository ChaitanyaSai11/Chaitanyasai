package fund5;

import java.util.Scanner;

public class str8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String replaceStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                replaceStr += 'i';
            } else {
                replaceStr += str.charAt(i);
            }
        }
        System.out.println(replaceStr);
    }
}
