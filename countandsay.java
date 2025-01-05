import java.util.*;
public class countandsay {
 public static String ans(int n)
    {


      

             if(n==1)
             {
                return "1";
             }

             String s= ans(n-1);
             String res="";
             int cnt=0;
             for(int i=0;i<s.length();i++)
             {
                        cnt++;
                if(i==s.length()-1 ||s.charAt(i)!=s.charAt(i+1))
                {
                    
                    res=res+cnt+s.charAt(i);
                    cnt=0;
                    
                }
                
             }
             return res;
    }
    public static void main(String[]args)
    {
              int n=4;
             String res= ans(n);
             System.out.println(res);
    }

    
}