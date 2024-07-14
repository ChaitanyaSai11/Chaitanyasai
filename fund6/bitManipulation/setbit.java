package fund6.bitManipulation;

public class setbit {
    /*
     * Set Bit;
     * Set the 2nd bit(position=1) of a number n.(n=0101)
     * Note:Indexing in bit manipulation from right to left
     * Bit Mask:1<<i
     * Operation : OR
     */
    public static void main(String[] args) {
        int n = 5;// 0101
        int shiftingPos = 1;
        int bitMask = 1 << shiftingPos;
        System.out.println(bitMask | n);
    }
}
