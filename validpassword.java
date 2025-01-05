import java.util.*;

public class validpassword {

    static boolean checkpassword(String str) {
        if (str.isEmpty()) {
            return false;
        }

        if (!(str.length() > 4)) {
            return false;
        }

        if (!(Character.isUpperCase(str.charAt(0)))) {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!((ch>=65&&ch<=90)||(ch>=97&&ch<=122)||(ch>=48&&ch<=57)  || (ch == '_')))
            // if(!(Character.isLetterorDigit(ch)||ch=='_'))

            {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your password");
        String str = sc.next();
        if (checkpassword(str)) {
            System.out.println("your password is correct");
        } else {
            System.out.println("your password is incorrect");
        }

    }
}
