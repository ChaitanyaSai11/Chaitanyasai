package fund3;

public class fun4 {
    public static void factorail(int n) {
        if (n < 0) {
            System.out.println("Invalid");
            return; // it does not go into next statement .return and clear the memory
        }
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
        System.out.println(fact);
        return;

    }

    public static void main(String[] args) {
        factorail(-1);

    }
}
