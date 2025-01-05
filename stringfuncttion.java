
import java.util.*;

public class stringfuncttion {

    public static void main(String[] args) {

        byte str[] = { 65, 78, 90 };
        String str1 = new String(str);
        System.out.println(str1);
        System.out.println(str1.length());

        StringBuilder str3 = new StringBuilder(str1);
        // System.out.println(str3.setCharAt(1, 'a'));

        str3.setCharAt(0, 'a');
        System.out.println(str3);
        StringBuffer str6 = new StringBuffer(str3);
        System.out.println(str6);

    }

}
