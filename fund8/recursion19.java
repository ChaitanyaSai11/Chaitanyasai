package fund8;

public class recursion19 {
    public static int placetiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        int vertical = placetiles(n - m, m);

        int horizontal = placetiles(n - 1, m);

        return vertical + horizontal;

    }

    public static void main(String[] args) {
        int result = placetiles(4, 2);
        System.out.println(result);
    }
}
