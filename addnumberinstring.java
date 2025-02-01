
import java.util.*;

public class addnumberinstring {

    public static int sum(String str) {
        int sum = 0;
        String s1="";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            

           // System.out.println("a" + a);
            if (Character.isDigit(ch))

            {
                 s1=s1+ch;
        
            }
        }

        System.out.println("s1="+s1);
        return sum;
    }

    public static void main(String[] args) {
        String str = "1abc23";
        System.out.println(sum(str));
        /*
         * ArrayList<Integer>a=new ArrayList<>();
         * a.add(12);
         * System.out.println(a.get(0));
         */

    }

}
