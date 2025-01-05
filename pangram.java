import java.util.*;
public class pangram {

static boolean checkpangram(String str)
{
    int n=26;
    boolean meet[]=new boolean[n];


    for(int i=0;i<str.length();i++)
    {
        char ch= str.charAt(i);
        int index=ch-'a';
        meet[index]=true;

    }

 for(int i=0;i<26;i++)
 {
    if(!meet[i])
    {
        return false;
    }
    
 }
return true;

}

    public static void main(String[]args)
    {
Scanner sc= new Scanner(System.in);
String str1=sc.next();
boolean ans=checkpangram(str1);
if(ans)
{
    System.out.println("given string pangram");
}
else{
    System.out.println("given string is not pangram");
}



    }



}
