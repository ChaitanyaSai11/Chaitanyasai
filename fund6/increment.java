package fund6;

class increment {

    // pre increment
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        b = ++a;
        // change value then use value
        System.out.println(a);
        System.out.println(b);

        // post increment
        int aa = 10;
        int bb = 0;

        bb = aa++;
        // use value then change value
        System.out.println(aa);
        System.out.println(bb); // 10 -use value
    }
}