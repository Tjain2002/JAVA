import java.util.*;

public class findsubinparent {

    public static int ans(String parent, String sub) {

        int index = 0, cnt = 0;
        while((index= parent.indexOf(sub,index))!=-1)
        {
              cnt++;
              index= index+sub.length();
        }
        return cnt;
        

    }

    public static void main(String[] args) {
         String str1= "abcdgdreabcdgbcd";
         String str="abc";
      int n=   ans(str1,str);
      System.out.println(n);

    }

}
