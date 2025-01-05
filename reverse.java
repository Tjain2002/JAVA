import java.util.*;
public class reverse{

    static void reversestring(char str[],int s,int e)
    {
        char temp;
          while(s<e)
          {
            temp=str[s];
            str[s]=str[e];
            str[e]=temp;

            s++;
            e--;


          }
    
    }

    public static void main(String[]args)
    {
Scanner sc= new Scanner(System.in);
String input=sc.next();
char str[]=input.toCharArray();

int s=0;
int e=str.length-1;
reversestring(str, s, e);
System.out.println(str);

    }
}
