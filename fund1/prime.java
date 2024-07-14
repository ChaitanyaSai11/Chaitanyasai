package fund1;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int s = 2; s < n; s++) {
            if (isprime(s)) {
                System.out.print(s + " ");
            }
        }
    }

    public static boolean isprime(int s) {
        if (s <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(s); i++) {
            if (s % i == 0) {
                return false;
            }
        }
        return true;
    }
}
