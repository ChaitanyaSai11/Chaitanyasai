package fund1;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();// or radius
        double pie = Math.PI;
        double area = pie * radius * radius;
        System.out.println(area);

        // no accuracy
        // float pie = 22 / 7;
        // float area = pi * radius * radius;
        // System.out.println(area);

    }
}
