package fund1;

import java.util.Scanner;

public class loops4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        for (int i = 0; i <= 5; i++) {
            sum += i;
        }
        System.out.println(sum);

        int i = 0;
        sum = 0;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
