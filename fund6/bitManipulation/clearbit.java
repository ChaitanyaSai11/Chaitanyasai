package fund6.bitManipulation;

public class clearbit {

    /*
     * Clear Bit;
     * clear the 3rd bit(position=2)of a number n.(n=0101)
     * Note:Indexing in bit manipulation from right to left
     * Bit Mask:1<<i
     * Operation :And with Not
     */

    public static void main(String[] args) {
        int n = 5;// 0101
        int shiftingPos = 2;
        int bitMask = 1 << shiftingPos;
        System.out.println((~bitMask) & n);

    }
}
