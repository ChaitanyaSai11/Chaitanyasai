package fund3;

public class fun5 {
    public static boolean primeorNot(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i < (n / 2); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(primeorNot(2));

    }

}

// public static void main(String[] args) {
// int n = 11;
// boolean isprime = true;
// if (n == 0 || n == 1) {
// isprime = false;
// } else {
// for (int i = 2; i <= (n / 2); i++) {
// if (n % i == 0) {
// isprime = false;
// }
// break;
// }

// }
// if (isprime) {
// System.out.println("Prime Number");
// } else {
// System.out.println("Not Prime Number");
// }

// }
