
import java.util.*;

public class isomorphic1 {

    public static boolean isomorphic(String str1, String str2) {

        int n1 = str1.length();
        int n2 = str2.length();
        char ch[] = str1.toCharArray();
        char ch1[] = str2.toCharArray();
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < i; j++) {
                if (ch[i] == ch[j] && ch[i] != ch1[j]) {
                    return false;
                }
                if (ch[i] != ch[j] && ch[i] == ch1[j]) {
                    return false;
                }

            }
        }

        return true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        boolean ans = isomorphic(str1, str2);
        if (ans) {
            System.out.println("given string are isomorphic");
        } else {
            System.out.println("given string are not isomorphic");
        }

    }

}
