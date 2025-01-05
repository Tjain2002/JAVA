
//import java.lang.reflect.Array;
import java.util.*;

public class repeatedcharinstring {

    public static void repeat(String str) {
        int ch[] = new int[26];
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            ch[ch1 - 'a']++;

        }

        for (int i = 0; i < 26; i++) {
            if (ch[i] > 1) {
                System.out.println(ch[i]);
                // System.out.println(str.charAt(i));
            }
        }

    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        repeat(str);
    }

}
