package fund6.bitManipulation;

public class getbit {

    /*
     * Get Bit;
     * Get the 3rd bit(position=2)of a number n.(n=0101)
     * Note:Indexing in bit manipulation from right to left
     * Bit Mask:1<<i
     * Operation :And
     */

    public static void main(String[] args) {
        int n = 5;// given no. in binary=0101
        int shiftingPos = 2;
        int bitMask = 1 << shiftingPos;// binary value<<no. of shifts
        if ((n & bitMask) == 0) {
            System.out.println(n & bitMask);
            System.out.println("bit was zero");
        } else {
            System.out.println(n & bitMask);
            System.out.println("bit was non zero");
        }
    }
}
