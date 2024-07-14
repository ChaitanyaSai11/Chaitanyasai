package fund4;

import java.util.ArrayList;
import java.util.Scanner;

public class arr14dim2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        int appendvalue = sc.nextInt();
        for (int i = 0; i < appendvalue; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(list);

    }
}
