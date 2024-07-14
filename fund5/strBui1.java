package fund5;

import java.util.Scanner;

public class strBui1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder a = new StringBuilder("Chaitanya");
        System.out.println(a);
        String str = sc.nextLine();
        StringBuilder b = new StringBuilder(str);
        System.out.println(b);
    }
}

// string builder : same variable changes ;
// string : same string update