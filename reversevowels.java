import java.math.BigInteger;
import java.util.*;

public class reversevowels {



    public static void main(String[]args)
    {



        String str1="11";
        String str2="1";
        int a=Integer.parseInt(str1,2);
        System.out.println(a);
        int b= Integer.parseInt(str2,2);
        int c= a+b;
        String ans= Integer.toBinaryString(c);
        System.out.println(ans);
        // BigInteger b=new BigInteger(ans);
    
      
        
   
    
//        String ch="icecream";
//        char str1[]=ch.toCharArray();
//        String str2="aeiouAEIOU";
//        int s=0,e=ch.length()-1;

//        while(s<e)
//        {

//         while(s<e && str2.indexOf(str1[s])==-1)
//         {
//          s++;
//         }
//         while(s<e && str2.indexOf(str1[e])==-1)
//         {
//          e--;
//         }
 
// char temp=str1[s];
// str1[s]=str1[e];
// str1[e]=temp;
// s++;
// e--;


//        }

//        StringBuilder str=new StringBuilder("");
//        str.append(new String(str1));
//        System.out.println(str);
      
        

    }
    
}
