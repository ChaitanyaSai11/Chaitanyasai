package fund4;

import java.util.Scanner;

public class arr10Dim2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int transpose[][] = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        System.out.println("Transpose matrix");

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }

}

// for square matrix
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int rows = sc.nextInt();
// int cols = sc.nextInt();
// int arr[][] = new int[rows][cols];
// for (int i = 0; i < rows; i++) {
// for (int j = 0; j < cols; j++) {
// arr[i][j] = sc.nextInt();
// }
// }

// for (int i = 0; i < rows; i++) {
// for (int j = i + 1; j < cols; j++) {// for square matrix j=i;
// int temp = arr[i][j];
// arr[i][j] = arr[j][i];
// arr[j][i] = temp;
// }
// }
// for (int i = 0; i < rows; i++) {
// for (int j = 0; j < cols; j++) {
// System.out.print(arr[i][j] + " ");

// }
// System.out.println();
// }
// }