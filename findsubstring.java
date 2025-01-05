
import java.util.*;

public class findsubstring {

    public static boolean ans(String S, String P)

    {
        //StringBuffer str=new StringBuffer(S);

        for (int i = 0; i < S.length(); i++)

        {
            if (S.equals(P)) {
                return true;
            }
            char ch = S.charAt(S.length() - 1);
            S = ch + S.substring(0, S.length() - 1);
            System.out.println(S);

        }
        return false;
    }

    public static void main(String[] args) {
        String S = "abcd";
        String P = "abdc";
        boolean res = ans(S, P);
        System.out.println(res);

    }

}
