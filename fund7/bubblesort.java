package fund7;

public class bubblesort {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 8, 6, 5, 4 };

        System.out.println("Step by step Iteration process");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            // for step by step iteration printing
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }

        // final iteration
        System.out.println("Final Iteration");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
