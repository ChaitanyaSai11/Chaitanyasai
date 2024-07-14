package fund6;

public class bitwiseOper {
    public static void main(String[] args) {
        int a = 3;// 0010
        int b = 4;// 0100
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);// 10-1 | 01-1 | 00=0 | 11-0
        System.out.println(a & ~a);
        System.out.println(a << 1);
        System.out.println(a << 2);
        System.out.println(a << 4);
        System.out.println(b >> 3);
    }

}
