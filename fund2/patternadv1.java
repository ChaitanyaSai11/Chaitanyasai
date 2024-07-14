package fund2;

public class patternadv1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            for (int j = 1; j <= 8 - i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j > 8 - i; j++) {
                System.out.print("*");
            }
            // for (int j = 1; j <= 8; j++) {
            // if (j <= i) {
            // System.out.print("*");
            // } else if (j <= 8 - i) {
            // System.out.print(" ");
            // } else {
            // System.out.print("*");
            // }
            // }
            System.out.println();
        }
        for (int i = 3; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            for (int j = 1; j > i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
