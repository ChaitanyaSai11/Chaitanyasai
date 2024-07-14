package fund2;

public class pattern4 {

    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// for (int i = n; i >= 0; i--) {
// for (int j = 0; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }

// int rows = 3;
// int columns = 3;

// for (int i = 0; i <= rows; i++) {
// for (int j = 0; j <= columns; j++) {
// if (i <= j) {
// System.out.print("*");
// }
// }
// System.out.println();
// }