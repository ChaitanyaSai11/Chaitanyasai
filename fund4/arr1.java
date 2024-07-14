package fund4;

import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 75;
        marks[1] = 85;
        marks[2] = 95;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[0] + " " + marks[1] + " " + marks[2]);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(i + " " + marks[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < marks.length; i++) {
            System.out.println(i + " " + marks[i]);
        }
        int arr[] = { 10, 20, 30, 40, 50 };
        System.out.println(arr[0]);
        System.out.println(arr.length);

    }
}
