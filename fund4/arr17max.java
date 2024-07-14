package fund4;

public class arr17max {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 4, 6 };

        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                max = arr[i + 1];
            }
        }
        System.out.println(max);
    }
}
