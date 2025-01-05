
import java.util.*;

public class checksentencepallindromic {

    public static boolean sentence(String str)

    {

        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                s = Character.toLowerCase(ch) + s;
            }
        }

        System.out.println(s);
        int s1 = 0, e = s.length() - 1;
        while (s1 < e) {
            if (s.charAt(s1) != s.charAt(e)) {
                return false;
            }
            s1++;
            e--;

        }
        return true;
    }

    public static void main(String[] args) {

        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        if (sentence(str)) {
            System.out.println("sentence is pallindromic");
        } else {
            System.out.println("sentence not pallindromic");
        }

    }

}

// { Driver Code Starts
