package fund4;

import java.util.Arrays;
import java.util.Scanner;

public class arr12Dim2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of rows");
        int rows = sc.nextInt();
        int[][] arr = new int[rows][];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("no of cols in " + (i + 1) + " row");
            int cols = sc.nextInt();
            arr[i] = new int[cols];
            System.out.println(("Enter row " + (i + 1) + " elements"));
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println("for each");

        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }

        // for (int i = 0; i < arr.length; i++) { // i==rows
        // for (int j = 0; j < arr[i].length; j++) { // j==colums
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }
    }
}
