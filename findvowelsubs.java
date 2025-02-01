import java.util.Arrays;
import java.util.*;

public class findvowelsubs {



   static int findlen(String str,String sub)
    {
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
    str = new String(ch);
    int cnt=0;

        int index=0;
        while((index=str.indexOf(sub,index))!=-1)
        {
              index++;
              cnt++;
        }
 System.out.println(str);
        return cnt;
    }
    public static void main(String[]args)
    {
        String str= "aeuoiu";
    
        String sub="aeiou";
    int res=    findlen(str,sub);
    System.out.println(res);

    }
    
}
