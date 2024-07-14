package fund3;

public class fun6 {
    public static void sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        sum(5);
    }
}

// public class Arra {
// public static int sum(int n) {
// // Base case
// if (n == 0) {
// return 0;
// }
// // Recursive case
// return n + sum(n - 1);
// }

// public static void main(String[] args) {
// int result = sum(5);
// System.out.println(result);
// }
// }
