package fund6.bitManipulation;

import java.util.Scanner;

public class update {
    /*
     * Update Bit;
     * Update the 2nd bit(position=1)of a number n to 1.(n=0101)
     * Note:Indexing in bit manipulation from right to left
     * 
     * For 0
     * Bit Mask:1<<i
     * 
     * For 1
     * Bit Mask:1<<i
     * Operation :OR
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int oper = sc.nextInt();
        int shiftingPos = 1;
        int bitMask = 1 << shiftingPos;
        switch (oper) {
            case 1:
                System.out.println(n | bitMask);
                break;
            case 0:
                System.out.println((~bitMask) & n);
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
