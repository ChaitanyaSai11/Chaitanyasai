package fund4;

import java.util.Arrays;

public class arr16swap {

    public static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 2, 50, 60, 80, 15, 33 };
        swap(arr, 0, 5);

        System.out.println(Arrays.toString(arr));
    }
}
