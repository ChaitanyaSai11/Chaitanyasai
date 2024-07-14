package fund2;

public class pattern8 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}

// int n = 5;
// for (int i = 0; i <= n; i++) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(j + " ");
// }
// System.out.println();
// }

// for (int i = 5; i >= 1; i--) {
// for (int j = 1; j <= i; j++) {
// System.out.print(j + " ");
// }
// System.out.println();
// }