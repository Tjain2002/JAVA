import java.util.*;
public class removevowel {



    public static int vowel(char ch[])
    {
              int k=0;
              for(int i=0;i<ch.length;i++)
              {
                if(ch[i]!='a'&&ch[i]!='e'&&ch[i]!='i'&&ch[i]!='o'&&ch[i]!='u')
                {
                          ch[k++]=ch[i];
                }
              }
             // System.out.println(k);
              return k;
            
    }


    public static void main(String[]args)
    {
Scanner sc=new Scanner(System.in);
String str=sc.next();
char ch[]=str.toCharArray();
int k=vowel(ch);
for(int i=0;i<k;i++)
{
    System.out.print(ch[i]);
}
    }
    
}
