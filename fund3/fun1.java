package fund3;

import java.util.Scanner;

public class fun1 {
    public static void printgivenName(String str) {
        System.out.println(str);
        return; // if we use void without returning any
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printgivenName(str);
    }
}
