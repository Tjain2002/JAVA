
import java.util.*;
public class rotatestring {

    public static  String rotate(String str,int n)
    {
           
             
     String anitclockwise=  str.substring(n)+ str.substring(0,n);
     String clockWise= str.substring(str.length()-n)+(str.substring(0,str.length()-n));

     return clockWise;
                 

             
    }

    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string which you want to rotate");
    String str=sc.next();
    System.out.println("enter the number of rotation ");
    int n=sc.nextInt();
    System.out.println(rotate(str,n));
    }
    
    
}
