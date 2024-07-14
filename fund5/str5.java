package fund5;

public class str5 {
    public static void main(String[] args) {
        String str1 = "Chaitanya";
        String str2 = "Chaitanya1";

        /*
         * Compare
         * string1> string2 :+ve
         * string1=string2 :0
         * string<string2 :-ve
         */
        if (str1.compareTo(str2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        System.out.println(str1.compareTo(str2));// negative value,because "Chaitanya" is "lexicographically" less than
                                                 // "Chaitanya1"
        System.out.println(str2.compareTo(str1));// positive value,because "Chaitanya" is "lexicographically" greater
                                                 // than "Chaitanya1"
        System.out.println(str1.compareTo(str1));// 0 because the strings are equal

        /*
         * Purpose:
         * 
         * equals: Checks if two objects are equal in terms of content.
         * compareTo: Compares the order of two objects.
         * Return Type:
         * 
         * equals: Returns a boolean value (true or false).
         * compareTo: Returns an integer value (negative, zero, or positive).
         * Interface:
         * 
         * equals: Defined in the Object class and can be overridden.
         * compareTo: Defined in the Comparable interface and must be implemented.
         * Comparison:
         * 
         * equals: Typically used to compare the content or state of two objects.
         * compareTo: Typically used to determine the ordering of objects.
         * Implementation:
         * 
         * equals: Should be overridden to provide meaningful equality comparison based
         * on the class's state.
         * compareTo: Must be implemented to provide natural ordering for the class.
         */

        str1 = "Chaitanya";
        str2 = "Chaitanya";

        if (str1.equals(str2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        System.out.println((str1.equals(str2)));

        if (str1 == str2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("strings are not equal");
        }

        if (new String("Chaitanya") == new String("Chaitanya")) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("strings are not equal");
        }

        /*
         * .equals(): Should be used to compare the content of two strings. It returns
         * true if the strings have the same sequence of characters.
         * ==: Compares references (memory addresses). It returns true if both
         * references point to the same object. For string literals, this can sometimes
         * give the correct result due to string interning, but for objects created with
         * new String(), it will usually return false unless explicitly interned.
         */

    }
}
