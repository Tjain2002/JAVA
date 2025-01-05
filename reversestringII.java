

import java.util.*;
public class reversestringII {


    public  static void reverse(String str)
    {
           int s=0,e=str.length()-1;
           char ch[]=str.toCharArray();

          while(s<e)
          {
          char temp=ch[s];
          ch[s] =ch[e];
          ch[e]=temp;
          s++;
          e--;

        
           

          }
//String newstr=ch.toString();
System.out.println(ch);


    }

    public static void main(String[]args)

    {
Scanner sc=new Scanner(System.in);
String str=sc.next();


reverse(str);
///System.out.println(str);

    }
}
