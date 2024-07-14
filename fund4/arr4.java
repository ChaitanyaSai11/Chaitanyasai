package fund4;

import java.util.Scanner;

public class arr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to search");
        int x = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (arr[i] == x) {
                System.out.println(i);
            }
        }
    }
}
