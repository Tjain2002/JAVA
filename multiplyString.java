import java.math.BigInteger;
import java.util.*;

public class multiplyString {

    public static void main(String[]args)
    {
        String str1="123456789";
        String str2="987654321";
    int a=0;
     int b=0;

        for(int i=0;i<str1.length();i++)
        {
            char ch= str1.charAt(i);
    
         a=ch-'0'+a*10;
        
            
        }

        for(int i=0;i<str2.length();i++)
        {
                char ch= str2.charAt(i);
                b=ch-'0'+b*10;


            

        }


        int c=a*b;
        String str="";
        str=str+c;
        System.out.println(str);



    }
    
}
