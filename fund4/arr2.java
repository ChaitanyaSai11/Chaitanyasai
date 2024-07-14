package fund4;

import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {
        System.out.println("array input at runtime : Enter size and then no's");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int age[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            age[i] = sc.nextInt();
        }

        // output
        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i] + " ");
        }
        System.out.println();
    }
}
