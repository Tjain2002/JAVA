import java.util.*;
public class checkcharacter {

    public static void main(String[]args)
    {
Scanner sc= new  Scanner(System.in);
char ch= sc.next().charAt(0);
if(ch>=65&&ch<=90)
{
    System.out.println(1);
}
else{
    System.out.println(-1);
}
    }


}