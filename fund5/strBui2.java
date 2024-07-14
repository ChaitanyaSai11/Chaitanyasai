package fund5;

public class strBui2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(" Chaitanya Sai");
        System.out.println(str.charAt(1));

        // setChartAt at certain position (replacing character at index)
        str.setCharAt(0, 'k');
        System.out.println(str);

        // insert at certain position (characters shifted to next)
        str.insert(0, "kella");
        System.out.println(str);

        // delete
        str.delete(0, 6);
        System.out.println(str);

        // append
        str.append(" Durga Rao");
        System.out.println(str);
        str.append(" Kella");
        System.out.println(str);
    }
}
