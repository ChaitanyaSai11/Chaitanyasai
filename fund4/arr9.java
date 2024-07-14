package fund4;

import java.util.Arrays;
import java.util.Scanner;

public class arr9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(num));

        for (String alpha : arr) {
            System.out.print(alpha + " ");
        }
    }
}
