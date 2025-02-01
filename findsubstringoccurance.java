import java.util.*;

public class findsubstringoccurance {


    public static void main(String[]args)
    {
        String parent="abcdabcdcdac";
         String subs="ab";
         int index=0,cnt=0;
         while((index=parent.indexOf(subs,index))!=-1)
           {
            
              index=subs.length()+index;
            cnt++;
        
        
         }


        // String str =parent.substring(0, 6);
        System.out.println(cnt);
        
    }
    
}

