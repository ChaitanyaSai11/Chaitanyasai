package fund4;

public class arr7 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 4 };
        boolean issorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                issorted = false;
            }
        }
        if (issorted) {
            System.out.println("Sorted in ascending order");
        } else {
            System.out.println("Not Sorted");
        }
    }
}
