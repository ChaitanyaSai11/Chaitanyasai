package fund1;

public class loops1 {
    public static void main(String[] args) {

        // printing hello world using loops
        System.out.println("For loop");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Hello world!");
        }

        System.out.println("While loop");
        int i = 1;
        while (i <= 3) {
            System.out.println("Hello world!");
            i++;
        }

        System.out.println("do while");

        i = 1;
        do {
            System.out.println("Hello World!");
            i++;
        } while (i <= 3);

    }
}
