package fund7;

public class selectionsort {
    public static void main(String[] args) {
        int arr[] = { 5, 7, 8, 3, 2 };
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

            // printing every iteration
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }

        // final iteration
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

// int arr[] = { 7, 8, 3, 1, 2 };

// for (int i = 0; i < arr.length - 1; i++) {
// int min = i;
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[min] > arr[j]) {
// min = j;
// }
// }
// int temp = arr[min];
// arr[min] = arr[i];
// arr[i] = temp;
// for (int j = 1; j < arr.length; j++) {
// System.out.print(arr[j] + " ");
// }
// System.out.println();
// }
// System.out.println("Final Iteration");
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }