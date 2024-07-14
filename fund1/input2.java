package fund1;

import java.util.Scanner;

public class input2 {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        // integer
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = a * b;
        System.out.println(mul);

        // float
        float price = sc.nextFloat();
        System.out.println(price);

        // string
        String surname = sc.next();
        System.out.println(surname);
        String fullname = sc.nextLine();// full input
        System.out.println(fullname);

    }
}
