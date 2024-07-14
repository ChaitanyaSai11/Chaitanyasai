package fund3;

import java.util.Scanner;

public class fun3 {
    public static int mul(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        int product = mul(a, b);
        System.out.println(product);

    }
}
