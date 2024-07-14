package fund1;

public class loops3 {
    public static void main(String[] args) {
        int n = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }

        int i = 1;
        while (i <= 10) {
            System.out.println(n + "*" + i + "=" + n * i);
            i++;
        }

        i = 1;
        do {
            System.out.println(n + "*" + i + "=" + n * i);
            i++;
        } while (i <= 10);
    }
}
