package fund5;

import java.util.Scanner;

public class str1 {
    public static void main(String[] args) {
        // string declaration
        String str = "Chaitanya Sai";
        System.out.println(str);

        // user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First name");
        String firstname = sc.next();
        sc.nextLine();
        System.out.println(firstname);

        System.out.println("Enter Full name");
        String fullname = sc.nextLine();
        System.out.println(fullname);

        // concatenation
        String name = firstname + " " + fullname;
        System.out.println(name);

        // length
        System.out.println("Length of string" + name.length());

    }
}
