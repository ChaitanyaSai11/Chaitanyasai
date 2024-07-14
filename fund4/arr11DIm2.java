package fund4;

import java.util.Arrays;
import java.util.Scanner;

public class arr11DIm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };
        for (int i = 0; i < arr.length; i++) { // i==rows
            for (int j = 0; j < arr[i].length; j++) { // j==colums
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
