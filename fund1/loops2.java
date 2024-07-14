package fund1;

import java.util.Scanner;

public class loops2 {
    public static void main(String[] args) {

        // printing upto n numbers
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int i = 0;
        while (i <= n) {
            System.out.print(i + ",");
            i++;
        }
        System.out.println();

        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }
}
