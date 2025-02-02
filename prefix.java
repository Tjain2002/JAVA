import java.util.*;

public class prefix {

    static String ans(String str[])

    {
        // StringBuilder sb = new StringBuilder(" ");
        String sb= " ";
        Arrays.sort(str);
        char ch[] = str[0].toCharArray();
        char ch1[] = str[str.length - 1].toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ch1[i]) {
                break;
            } else {
                // sb.append(ch[i]);
                sb=sb+ch[i];
            }
        }
        // return sb.toString();
        return sb;

    }

    public static void main(String[] args) {
        String str[] = { "dog", "dogcat", "dog" };
        String res = ans(str);
        System.out.println("prefix=" + res);

    }

}
