package fund5;

public class str4 {
    public static void main(String[] args) {

        // Integer to String
        int num = 123;
        String str = Integer.toString(num);
        System.out.println(str.length());

        // String to Integer
        String str2 = "123";
        int number = Integer.parseInt(str2);
        System.out.println(number);

        // data type of variable
        System.out.println(((Object) number).getClass().getSimpleName());
        System.out.println(((Object) str).getClass().getSimpleName());
    }
}
