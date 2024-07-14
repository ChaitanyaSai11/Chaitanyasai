package fund6.bitManipulation;

public class converting {
    public static void main(String[] args) {
        int n = 5;

        // integer to binary string
        String binaryResult = Integer.toBinaryString(n);
        System.out.println(binaryResult);

        // binarystring to integer
        int num = Integer.parseInt(binaryResult, 2);
        System.out.println(num);
    }
}
