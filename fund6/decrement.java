package fund6;

public class decrement {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        b = --a;

        System.out.println(a);
        System.out.println(b);

        a = 10;
        b = 0;
        b = a--;
        System.out.println(a);
        System.out.println(b);

        for (int i = 2; i <= 10; ++i) {
            System.out.println(i);
        }
    }
}
