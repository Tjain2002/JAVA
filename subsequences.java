import java.util.*;

public class subsequences {

    static boolean issubsequence() {
        String str1 = "aec";
        String str2 = "acbcdrfe";
        int i = 0, j = 0;
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
            }

            j++;
        }

        return i == str1.length();
    }

    public static void main(String[] args) {

        boolean ans = issubsequence();
        System.out.println(ans);

    }

}
