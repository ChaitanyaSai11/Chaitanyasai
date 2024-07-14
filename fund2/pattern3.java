package fund2;

public class pattern3 {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= columns; j++) {
                if (j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

// for (int j = 0; j <= i; j++) {
// System.out.print("*");
// }
