package fund2;

public class pattern2 {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 4;
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= columns; j++) {
                if (i == rows || j == columns || i == 0 || j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
