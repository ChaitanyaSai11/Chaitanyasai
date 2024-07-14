package fund8;

public class recursion18 {
    public static int countmazepaths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // move downwards
        int down = countmazepaths(i + 1, j, n, m);

        // move right
        int right = countmazepaths(i, j + 1, n, m);

        return down + right;
    }

    public static void main(String[] args) {
        System.out.println(countmazepaths(0, 0, 3, 3));
    }
}
