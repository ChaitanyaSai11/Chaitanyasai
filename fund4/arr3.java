package fund4;

public class arr3 {
    public static void main(String[] args) {
        System.out.println("access elements which are less than 25 in array");
        int arr[] = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 25) {
                System.out.println(arr[i]);
            }
        }
    }
}
