package fund4;

import java.util.Scanner;

public class arr8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int num : arr) { // for each
            System.out.print(num + " ");
        }
    }
}
