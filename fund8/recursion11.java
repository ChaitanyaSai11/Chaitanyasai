package fund8;

public class recursion11 {
    public static boolean issorted(int arr[], int i) {

        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            // array is sorted till now
            return false;
        }

        return issorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        boolean sorted = issorted(arr, 0);
        System.out.println(sorted);
        if (sorted) {
            System.out.println("array is sorted in increasing order");
        } else {
            System.out.println("array is not sorted in increasing order");
        }
    }
}
