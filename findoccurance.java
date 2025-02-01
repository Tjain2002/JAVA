import java.util.*;

public class findoccurance {


    public static void main(String[]args)
    {
       Scanner sc =new Scanner(System.in);
       System.out.println("enter the num1 ");
       int num1=sc.nextInt();
       System.out.println("enter the num2");
       int num2=sc.nextInt();
       int rem=0,cnt=0;
       while(num1!=0)
       {
        rem=num1%10;
        num1=num1/10;
        if(rem==num2)
        {
            cnt++;
        }
       
       }


System.out.println("count="+cnt);

    }
    
}
