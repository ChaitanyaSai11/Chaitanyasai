package fund8;

public class recursion1 {

    public static void printNum(int n) {
        if (n < 1) { // base case (n==0)
            return;
        }

        System.out.print(n + " ");// printing
        printNum(n - 1); // recursion

    }

    public static void main(String[] args) {
        int n = 5;
        printNum(n); // function call
    }
}
