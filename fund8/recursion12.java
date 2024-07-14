package fund8;

public class recursion12 {
    public static void xtoEnd(String str, char element, int idx, String newsString, int count) {
        if (idx == str.length() - 1) {
            String xrepatString = String.valueOf(element).repeat(count);
            System.out.println(newsString + xrepatString);
            return;
        }

        if (str.charAt(idx) == element) {
            count++;
        } else {
            newsString += str.charAt(idx);
        }
        xtoEnd(str, element, idx + 1, newsString, count);

    }

    public static void main(String args[]) {
        String str = "axbcxxd";
        char element = 'x';
        String newstring = "";
        xtoEnd(str, element, 0, newstring, 0);
    }
}
