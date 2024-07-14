package fund1;

import java.util.Scanner;

public class constmts3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        // if condition
        if (age < 18) {
            System.out.println("age : " + age + " is not eligible to vote");
        }

        // another format
        if (age > 18)
            System.out.println("eligible");

        // if,else
        if (age < 18) {
            System.out.println("Not eligble");
        } else {
            System.out.println("eligible");
        }

        // elseif
        int num = sc.nextInt();
        if (num % 2 == 0 & num >= 0) {
            System.out.println("num is divisible by 2");
        } else if (num % 2 != 0 & num >= 0) {
            System.out.println("num is not divisible by 2");
        } else {
            System.out.println("not valid");
        }

        // switch
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("bye");
                break;
            default:
                System.out.println("Invalid option");
        }

        // practice
        /*
         * Make a Calculator. Take 2 numbers (a & b) from the user and an operation as
         * follows :
         * 1 : + (Addition) a + b
         * 2 : - (Subtraction) a - b
         * 3 : * (Multiplication) a * b
         * 4 : / (Division) a / b
         * 5 : % (Modulo or remainder) a % b
         * Calculate the result according to the operation given and display it to the
         * user.
         */
        int a = sc.nextInt();
        int b = sc.nextInt();
        String operator = sc.next();
        switch (operator) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "%":
                System.out.println(a % b);
                break;

            default:
                System.out.println("Invalid operator");
                break;
        }

        // Ask the user to enter the number of the month & print the name of the month.
        // For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on

        int month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
