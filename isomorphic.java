import java.util.*;

public class isomorphic {

    static boolean checkisomorphic(String str1, String str2) {

        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 != len2) {
            return false;
        }
        char ch[] = str1.toCharArray();
        char ch1[] = str2.toCharArray();

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < i; j++) {

                if (ch[i] != ch[j] && ch1[i] == ch[j]) {
                    return false;
                }
                if (ch[i] == ch[j] && ch1[i] != ch1[j]) {
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
        boolean ans = checkisomorphic(str1, str2);
        if (ans) {
            System.out.println("string is isomorphic");
        } else {
            System.out.println("string is not isomorphic");
        }

    }

}
