package fund4;

import java.util.Scanner;

public class arr9Dim2 {
    public static void main(String[] args) {
        int rows = 2;
        int colums = 2;
        int arr[][] = new int[rows][colums];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter which element you want ");
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                if (arr[i][j] == x) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }
}
