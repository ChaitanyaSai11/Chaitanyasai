package fund8;

//print Numbers from 1 to 5
public class recursion2 {
    public static void printNum(int i, int n) {
        if (i == n) {
            System.out.println(i);
            return;
        }
        System.out.println(i);
        printNum(i + 1, n);
    }

    public static void main(String[] args) {
        printNum(1, 5);
    }

}

// public static void printNum(int n) {
// if (n == 6) {
// return;
// }
// System.out.println(n);
// printNum(n + 1);
// }

// public static void main(String[] args) {
// int n = 1;
// printNum(n);
// }