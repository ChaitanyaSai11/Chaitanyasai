package fund7;

public class insertionsort {
    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };
        System.out.println("Iteration wise execution");
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            // placement of element
            arr[j + 1] = current;
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
        System.out.println("Final Iteration");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
