package fund1;

import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt();
        char asciival = (char) val;
        System.out.println(asciival);

        char ch = sc.next().charAt(0);
        int asciich1 = (int) ch;

        System.out.println(asciich1);

        // // char ch1 = 'A';
        // // char ch2 = 'b';
        // // int ascii = ch1;
        // int value = 1;
        // char asciichar = (char) value;
        // System.out.println(asciichar);

    }
}
