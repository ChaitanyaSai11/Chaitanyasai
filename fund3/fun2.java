package fund3;

import java.util.Scanner;

public class fun2 {
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        int sum = add(a, b);
        System.out.println(sum);// calling function

    }

}

// public static void add(int a, int b) {
// System.out.println(a + b);
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("a");
// int a = sc.nextInt();
// System.out.println("b");
// int b = sc.nextInt();
// add(a, b);
// }
