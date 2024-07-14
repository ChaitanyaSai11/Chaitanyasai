package fund5;

import java.util.Scanner;

public class str7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int totLength = 0;
        for (int i = 0; i < size; i++) {
            array[i] = sc.next();
            totLength += array[i].length();
        }
        System.out.println(totLength);
    }

}

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// String arr[] = new String[size];
// for (int i = 0; i < size; i++) {
// arr[i] = sc.next();
// }
// for (int i = 0; i < size; i++) {
// System.out.println(arr[i] + " ");
// }
// System.out.println(arr.length);

// }
