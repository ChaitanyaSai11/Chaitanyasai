package fund4;

import java.util.ArrayList;
import java.util.Scanner;

public class arr13List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);// add new element to list at end
        System.out.println(list);
        list.add(sc.nextInt());
        System.out.println(list); // printing complete list
        System.out.println(list.size()); // ArrayList size
        System.out.println(list.get(1)); // get element by index

        // for(int i=0;i<5;i++){
        // list.add(sc.nextInt());
        // }
        // System.out.println(list);

        // for existing list
        /*
         * for(int i=list.size()-1;i<list.size()+appendvalue;i++){
         * list.add(sc.nextInt());
         * }
         */
    }
}
